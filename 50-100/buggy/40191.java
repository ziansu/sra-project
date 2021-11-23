private void updatePanel(de.hshannover.f4.trust.visitmeta.gui.util.RestConnection restConnection) {
    mJtfName.setText(restConnection.getConnectionName());
    mJtfUrl.setText(restConnection.getUrl());
    mJtfUsername.setText(restConnection.getUsername());
    mJtfPassword.setText(restConnection.getPassword());
    mJcbBasicAuthentication.setSelected(restConnection.isAuthenticationBasic());
    mJcbConnectingAtStartUp.setSelected(restConnection.isStartupConnect());
    mJtfMaxPollResultSize.setText(restConnection.getMaxPollResultSize());
}