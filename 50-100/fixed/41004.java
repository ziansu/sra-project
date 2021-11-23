public static WireFront.EngagementPage Goto(WireFront.enums.ClientType clientType) {
    java.lang.String URL = Common.wire.concat(Navigation.urlEngagement).concat(clientType.getKeyword());
    if (!(WireFront.Browser.isDriverValid(common.WireBrowser.Instance()))) {
        common.WireBrowser.Open();
        WireFront.Browser.gotoURL(common.WireBrowser.Instance(), URL);
        WireFront.Wait.waitFor(common.WireBrowser.Instance(), WireFront.EngagementPage.mainForm, true);
    }
    return new WireFront.EngagementPage();
}