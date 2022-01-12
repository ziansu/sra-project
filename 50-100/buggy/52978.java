public static org.jboss.windup.web.addons.websupport.model.ReportFilterDTO fromMap(java.util.Map<java.lang.String, java.lang.Object> map) {
    org.jboss.windup.web.services.model.ReportFilterDTOImpl filter = new org.jboss.windup.web.services.model.ReportFilterDTOImpl();
    if (map.containsKey("selectedApplications")) {
        filter.selectedApplications.addAll(((java.util.ArrayList<java.lang.String>) (map.get("selectedApplications"))));
    }
    if (map.containsKey("enabled")) {
        filter.isEnabled = ((java.lang.Boolean) (map.get("enabled")));
    }
    return filter;
}