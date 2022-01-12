@org.springframework.web.bind.annotation.RequestMapping(value = "/datadistribution/start")
public java.lang.String calculateDistribution(javax.servlet.http.HttpServletRequest request, java.lang.String fqdn) {
    if (fqdn != null) {
        org.schedoscope.metascope.model.MetascopeTable table = metascopeTableService.findByFqdn(fqdn);
        if (table != null) {
            org.schedoscope.metascope.service.MetascopeDataDistributionService.Status status = metascopeDataDistributionService.checkStatus(table);
            if (status.equals(MetascopeDataDistributionService.Status.NotAvailable)) {
                metascopeDataDistributionService.calculateDistribution(table);
            }
        }
    }
    return ("redirect:" + (request.getHeader("Referer"))) + "#datadistributionContent";
}