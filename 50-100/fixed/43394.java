@org.apache.struts2.interceptor.validation.SkipValidation
public java.lang.String renew() {
    populateWorkflowBean();
    licenseService().renew(license(), workflowBean);
    addActionMessage(((this.getText("license.renew.submission.succesful")) + (license().getLicenseNumber())));
    return org.egov.tl.utils.Constants.ACKNOWLEDGEMENT_RENEW;
}