private static void verifyWire(boolean present) {
    common.WireBrowser.gotoWireURL(JobProcessingTests.authLink);
    WireFront.MainWirePage.Goto().verifyMessage(JobProcessingTests.messageWire, present);
}