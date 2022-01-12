public emerald.portal.ConfigureNew_ProductStep1 clickSaveButton() {
    core.Actions.click(common.DriverManager.getDriver(DriverType.LOOP), emerald.portal.ConfigureNew.btnConfigureNewForm(ConfigureNew_Button.SAVE));
    core.Wait.waitFor(common.DriverManager.getDriver(DriverType.LOOP), ConfigureNew_ProductStep1.pageFrame, true);
    core.Wait.loadingCheck(common.DriverManager.getDriver(DriverType.LOOP));
    return new emerald.portal.ConfigureNew_ProductStep1();
}