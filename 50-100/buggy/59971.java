public org.kuali.ole.deliver.controller.checkout.OlePatronDocument getPatronDocumentForItemValidation(org.kuali.ole.deliver.form.OLEForm oleForm) {
    java.util.Map<org.kuali.ole.deliver.controller.checkout.OlePatronDocument, org.kuali.ole.deliver.controller.checkout.OlePatronDocument> patronForWhomLoanIsBeingProcessed = identifyPatron(oleForm);
    org.kuali.ole.deliver.controller.checkout.OlePatronDocument patronDocument = getPatronDocument(patronForWhomLoanIsBeingProcessed);
    org.kuali.ole.deliver.controller.checkout.OlePatronDocument scanedPatron = getCircForm(oleForm).getPatronDocument();
    if (!(org.apache.commons.lang3.StringUtils.equals(scanedPatron.getOlePatronId(), patronDocument.getOlePatronId()))) {
        patronDocument.setSelectedProxyForPatron(scanedPatron);
    }
    return patronDocument;
}