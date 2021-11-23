public void enterAPIName(java.lang.String apiname) throws java.lang.InterruptedException {
    loggerMP.debug("Entering spname");
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(getElement(txtAPIName)));
    getElement(txtAPIName).clearAndSendkeys(apiname);
    getElement(txtAPIName).sendEnter();
    loggerMP.debug("Entered Api name");
    java.lang.Thread.sleep(com.wso2telco.apimanager.pageobjects.apihome.manager.SLEEPTIME);
}