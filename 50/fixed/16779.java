@java.lang.Override
protected void onStop() {
    super.onStop();
    org.dhis2.messenger.core.xmpp.XMPPClient.getInstance().leaveMUC();
    org.dhis2.messenger.core.xmpp.XMPPSessionStorage.getInstance().setCallback(null);
}