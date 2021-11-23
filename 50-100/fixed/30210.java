@org.junit.Test
public void itShouldBeAvailableInWorkspace() throws DocumentBasePage.UserNotConnectedException, java.io.IOException {
    org.nuxeo.functionaltests.pages.DocumentBasePage documentBasePage = login();
    org.nuxeo.functionaltests.pages.DocumentBasePage workspacesPage = documentBasePage.getNavigationSubPage().goToDocument("Workspaces");
    workspacesPage.getNavigationSubPage().goToDocument(org.nuxeo.functionaltests.ITSpreadsheetTest.WORKSPACE_TITLE);
    org.nuxeo.functionaltests.contentView.ContentViewElement contentView = getWebFragment(org.openqa.selenium.By.id("cv_document_content_0_panel"), org.nuxeo.functionaltests.contentView.ContentViewElement.class);
    contentView = contentView.switchToResultLayout(ResultLayout.LISTING);
    org.junit.Assert.assertNotNull(contentView.getActionByTitle(org.nuxeo.functionaltests.ITSpreadsheetTest.SPREADSHEET_ACTION_TITLE));
    logout();
}