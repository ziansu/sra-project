@java.lang.Override
protected void onItemNotFound(final org.bonitasoft.web.toolkit.client.data.APIID caseId) {
    final org.bonitasoft.console.client.user.cases.action.OnCaseDetailsNotFound onCaseDetailsNotFound = new org.bonitasoft.console.client.user.cases.action.OnCaseDetailsNotFound() {
        @java.lang.Override
        protected void redirectToArchivedCaseMoredetails(final java.lang.String archivedCaseId) {
            com.google.gwt.user.client.History.newItem(((((("?_p=" + (ArchivedCaseMoreDetailsAdminPage.TOKEN)) + "&id=") + archivedCaseId) + "&_pf=") + (org.bonitasoft.web.toolkit.client.ClientApplicationURL.getProfileId())));
        }
    };
    onCaseDetailsNotFound.checkIfCaseIsArchived(caseId.toString());
}