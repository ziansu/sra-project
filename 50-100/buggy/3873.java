@org.apache.struts2.interceptor.validation.SkipValidation
@org.apache.struts2.convention.annotation.Action(value = "/masters/scheme-beforeView")
public java.lang.String beforeView() {
    if (org.egov.web.actions.masters.SchemeAction.LOGGER.isDebugEnabled())
        org.egov.web.actions.masters.SchemeAction.LOGGER.debug("..Inside Before View Method..");
    
    this.scheme = ((org.egov.commons.Scheme) (persistenceService.find("from Scheme where id=?", this.scheme.getId())));
    this.mode = org.egov.web.actions.masters.SchemeAction.VIEW;
    return org.egov.web.actions.masters.SchemeAction.VIEW;
}