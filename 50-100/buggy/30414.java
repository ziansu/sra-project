@org.egov.infra.web.struts.annotation.ValidationErrorPage(value = org.egov.tl.utils.Constants.NEW)
public java.lang.String create(final T license) {
    try {
        this.setCheckList();
        populateWorkflowBean();
        licenseService().create(license, workflowBean);
    } catch (final java.lang.RuntimeException e) {
        loadAjaxedDropDowns();
        throw e;
    }
    addActionMessage(((this.getText("license.submission.succesful")) + (license().getApplicationNumber())));
    return org.egov.tl.utils.Constants.ACKNOWLEDGEMENT;
}