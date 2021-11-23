@org.apache.struts2.interceptor.validation.SkipValidation
@java.lang.Override
public java.lang.String execute() {
    try {
        _agencies = _transitDataService.getAgenciesWithCoverage();
    } catch (java.lang.Throwable t) {
        org.onebusaway.webapp.actions.admin.servicealerts.ServiceAlertsAction._log.error("unable to retrieve agencies with coverage", t);
        org.onebusaway.webapp.actions.admin.servicealerts.ServiceAlertsAction._log.error("issue connecting to TDS -- check your configuration in data-sources.xml");
        throw new java.lang.RuntimeException("Check your onebusaway-nyc-transit-data-federation-webapp configuration", t);
    }
    return SUCCESS;
}