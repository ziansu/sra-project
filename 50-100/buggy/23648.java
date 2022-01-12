public static void SelectAction(org.openqa.selenium.WebDriver driver, java.lang.String arg1) throws java.lang.Exception {
    if (arg1.contentEquals("BLANK")) {
        com.msuit.lp.aux.AngularWaiter.waitForAngularLoad();
        com.msuit.lp.aux.AngularWaiter.sleep(1000);
        new org.openqa.selenium.interactions.Actions(driver).click(FiltersBarPage.Filter.Interaction.selectblank).perform();
        return ;
    }else
        com.msuit.lp.aux.AngularWaiter.waitForAngularLoad();
    
    com.msuit.lp.aux.AngularWaiter.sleep(1000);
    new org.openqa.selenium.interactions.Actions(driver).click(FiltersBarPage.Filter.Interaction.selectaction).perform();
}