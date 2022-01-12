@java.lang.Override
void checkSettings() throws java.lang.Exception {
    clearCertificateErrorNotifications(CheckDirection.OUTGOING);
    if (!((this.account.getRemoteStore()) instanceof com.fsck.k9.mail.store.webdav.WebDavStore)) {
        publishProgress(R.string.account_setup_check_settings_check_outgoing_msg);
    }
    com.fsck.k9.mail.Transport transport = com.fsck.k9.mail.TransportProvider.getInstance().getTransport(K9.app, this.account);
    transport.close();
    try {
        transport.open();
    } finally {
        transport.close();
    }
}