@java.lang.Override
protected void onItemNotFound(final org.bonitasoft.web.toolkit.client.data.APIID caseId) {
    final org.bonitasoft.console.client.user.cases.action.OnCaseDetailsNotFound onCaseDetailsNotFound = new org.bonitasoft.console.client.user.cases.action.OnCaseDetailsNotFound(ArchivedCaseMoreDetailsAdminPage.TOKEN);
    onCaseDetailsNotFound.checkIfCaseIsArchived(caseId.toString());
}