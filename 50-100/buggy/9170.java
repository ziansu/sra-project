@org.testng.annotations.Test
public void test11_AddNewHTMLFile() {
    org.exoplatform.selenium.TestLogger.info("Test 11 Add new HTML file");
    java.lang.String HTMLFILE_NAME = "HTMLfile" + (getRandomNumber());
    java.lang.String HTMLFILE_CONTENT = "HTML file " + (getRandomNumber());
    navToolBar.goToSiteExplorer();
    actBar.goToAddNewContent();
    org.exoplatform.selenium.TestLogger.info("Create new HTML file");
    cTemplate.createNewHtmlFile(HTMLFILE_NAME, "", HTMLFILE_CONTENT, true);
    org.exoplatform.selenium.TestLogger.info("Restore data");
    actBar.goToNodeByAddressPath("/");
    cMenu.deleteDocument(ecms.ELEMENT_NODE_ROW_VIEW.replace("${nodeName}", HTMLFILE_NAME));
}