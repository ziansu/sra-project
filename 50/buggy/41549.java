@org.apache.struts2.interceptor.validation.SkipValidation
@org.apache.struts2.convention.annotation.Action(value = "/masters/scheme-newForm", results = @org.apache.struts2.convention.annotation.Result(name = NEW, location = "/WEB-INF/jsp/masters/scheme-new.jsp"))
public java.lang.String newForm() {
    if (org.egov.web.actions.masters.SchemeAction.LOGGER.isDebugEnabled())
        org.egov.web.actions.masters.SchemeAction.LOGGER.debug("..Inside NewForm method..");
    
    this.mode = NEW;
    return NEW;
}