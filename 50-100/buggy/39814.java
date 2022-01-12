public void setSyncForAccount(com.xabber.android.data.entity.AccountJid account, boolean sync) {
    org.jxmpp.jid.BareJid bareJid = account.getFullJid().asBareJid();
    if (bareJid != null) {
        for (com.xabber.android.data.xaccount.XMPPAccountSettings accountSettings : xmppAccounts) {
            if (accountSettings.getJid().equals(bareJid.toString())) {
                accountSettings.setSynchronization(sync);
                saveSettingsToRealm();
            }
        }
    }
}