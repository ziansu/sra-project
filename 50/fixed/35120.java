@java.lang.Override
public void onSuccess(java.lang.Long expirationTime) {
    gov.nist.appvet.gwt.client.gui.AppVetPanel.sessionTimeLeft(expirationTime);
}