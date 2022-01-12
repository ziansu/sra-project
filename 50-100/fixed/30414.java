@org.egov.infra.web.struts.annotation.ValidationErrorPage(value = org.egov.tl.utils.Constants.NEW)
public java.lang.String create(final T license) {
    this.setCheckList();
    populateWorkflowBean();
    licenseService().create(license, workflowBean);
    addActionMessage(((this.getText("license.submission.succesful")) + (license().getApplicationNumber())));
    return org.egov.tl.utils.Constants.ACKNOWLEDGEMENT;
}