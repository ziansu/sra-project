public ClientPortal.RelayMessengerSendReceivePage clickDeleteReminderButton(boolean acknowledge) {
    core.Actions.click(common.ClientPortalBrowser.Instance(), ClientPortal.RelayMessengerSendReceivePage.btnDeleteReminder, false);
    if (acknowledge) {
        core.Browser.acknowledge(common.ClientPortalBrowser.Instance());
    }else {
        core.Browser.cancel(common.ClientPortalBrowser.Instance());
    }
    return this;
}