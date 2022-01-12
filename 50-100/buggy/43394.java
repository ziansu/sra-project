@org.apache.struts2.interceptor.validation.SkipValidation
public java.lang.String renew() {
    try {
        populateWorkflowBean();
        licenseService().renew(license(), workflowBean);
        addActionMessage(((this.getText("license.renew.submission.succesful")) + (license().getLicenseNumber())));
    } catch (final java.lang.RuntimeException e) {
        loadAjaxedDropDowns();
        throw e;
    }
    return org.egov.tl.utils.Constants.ACKNOWLEDGEMENT_RENEW;
}