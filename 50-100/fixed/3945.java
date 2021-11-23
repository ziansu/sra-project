public clientportal.WireMessageEditorPage verifyTestURL(final java.lang.String testURL, boolean present) {
    clientportal.Browser.gotoNextWindow(common.DriverManager.getDriver(DriverType.LOOP));
    clientportal.Assertions.verifyURL(common.DriverManager.getDriver(DriverType.LOOP), testURL, present);
    clientportal.Browser.closePopUps(common.DriverManager.getDriver(DriverType.LOOP));
    return this;
}