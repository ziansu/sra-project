@org.springframework.web.bind.annotation.RequestMapping(value = "/close/{applicationCode}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String view(final org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
final java.lang.String applicationCode, final javax.servlet.http.HttpServletRequest request) {
    final java.lang.String meesevaApplicationNumber = request.getParameter("meesevaApplicationNumber");
    final org.egov.wtms.application.entity.WaterConnectionDetails waterConnectionDetails = getWaterConnectionDetails(applicationCode);
    if (((waterConnectionDetails.getCloseConnectionType()) != null) && (org.egov.wtms.utils.constants.WaterTaxConstants.PERMENENTCLOSECODE.equals(waterConnectionDetails.getCloseConnectionType())))
        throw new org.egov.infra.exception.ApplicationRuntimeException("connection.closed");
    
    return loadViewData(model, request, waterConnectionDetails, meesevaApplicationNumber);
}