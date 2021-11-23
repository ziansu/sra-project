@Zwave.Test(priority = 3)
public void groupOff() throws java.lang.Exception {
    getDriver1().findElement(org.openqa.selenium.By.xpath(("id('ctl00_phBody_ucLightGroupRepeaterControl_SwitchesAndDimmers_" + "rptGroups_ctl00_btnGroupOff')"))).click();
    getDriver1().findElement(org.openqa.selenium.By.id(("ctl00_phBody_ucLightGroupRepeaterControl_SwitchesAndDimmers_rptGroups_ctl00" + "_lnkGroupEdit"))).click();
    java.lang.Thread.sleep(2000);
    checkPanelUI("light_off", false);
}