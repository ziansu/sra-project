public static void GoTo() {
    java.lang.String URL = com.relaynetwork.automation.framework.WireFront.Navigation.wire.concat("/connect/#search");
    if (!(com.relaynetwork.automation.framework.WireFront.Navigation.ConnectBoxPage.IsAt())) {
        com.relaynetwork.automation.framework.common.WireBrowser.Open();
        com.relaynetwork.automation.framework.WireFront.Browser.gotoURL(com.relaynetwork.automation.framework.common.WireBrowser.Instance(), URL);
        com.relaynetwork.automation.framework.WireFront.Wait.explicitWait(com.relaynetwork.automation.framework.common.WireBrowser.Instance(), 5, com.relaynetwork.automation.framework.WireFront.Conditions.elementToBeClickable(com.relaynetwork.automation.framework.WireFront.ConnectBoxPage.submitButtonId));
    }
    if (!(com.relaynetwork.automation.framework.WireFront.Navigation.ConnectBoxPage.IsAt())) {
        throw new org.openqa.selenium.NotFoundException("Expected to be at Connect Box Page, but am not.");
    }
}