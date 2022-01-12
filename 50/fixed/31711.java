private static void verifyWire() {
    common.WireBrowser.gotoWireURL(JobProcessingTests.authLink);
    WireFront.MainWirePage.Goto().verifyMessage(JobProcessingTests.messageWire, true);
}