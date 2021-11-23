public java.lang.String getLastAuthLink() {
    return adminportal.Actions.getText(common.AdminPortalBrowser.Instance(), adminportal.ConsumerDetailsPage.lastValueInTable(ConsumerDetailsTable.AUTH_LINK, ConsumerDetailsColumn.AUTH_LINK), "text");
}