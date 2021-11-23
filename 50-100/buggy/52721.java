@org.testng.annotations.Test
public void test10_AddNewHtmlFile() {
    java.lang.String Html_File_Name = "HTML_File_case_78925";
    java.lang.String Html_content = "Content Of HTML file";
    org.exoplatform.selenium.TestLogger.info("Add new HTML File document");
    actBar.goToAddNewContent();
    conTemp.createNewHtmlFile(Html_File_Name, "", Html_content);
    org.exoplatform.selenium.TestLogger.info("Restore data");
    actBar.chooseDrive(ecms.ELEMENT_PERSONAL_DRIVE);
    waitForAndGetElement(ecms.ELEMENT_NODE_ADMIN_VIEW.replace("${nodeName}", Html_File_Name));
    actBar.actionsOnElement(Html_File_Name, actionType.DELETE);
}