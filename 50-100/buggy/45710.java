@org.apache.struts2.interceptor.validation.SkipValidation
@org.apache.struts2.convention.annotation.Action(value = "/masters/scheme-beforeEdit")
public java.lang.String beforeEdit() {
    this.scheme = ((org.egov.commons.Scheme) (persistenceService.find("from Scheme where id=?", this.scheme.getId())));
    if (org.egov.web.actions.masters.SchemeAction.LOGGER.isDebugEnabled())
        org.egov.web.actions.masters.SchemeAction.LOGGER.debug("..Inside Before Edit Method..");
    
    this.mode = EDIT;
    return EDIT;
}