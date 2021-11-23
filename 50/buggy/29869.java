public ClientPortal.RelayMessengerSendReceivePage clickMessageInQueue(java.lang.String mobileNumber) {
    core.Actions.click(common.ClientPortalBrowser.Instance(), ClientPortal.RelayMessengerSendReceivePage.targetMessageInQueue(RelayMessengerSendReceiveQueueField.MOBILE, core.Utilities.formatMobileNumber(mobileNumber)));
    return this;
}