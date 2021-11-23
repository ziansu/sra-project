public void updateAuthenticatedStatus() {
    prefButton.setEnabled(Settings.authenticated);
    mangButton.setEnabled(Settings.authenticated);
    submGuiButton.setEnabled(Settings.authenticated);
    if (!(org.gridchem.client.common.Settings.WEBSERVICE)) {
        usageButton.setEnabled(Settings.authenticated);
    }
    if (org.gridchem.client.common.Settings.authenticated) {
        setAuthButton("Sign Out", "<html><p>Disconnect from the CCG.</p><html>");
    }else {
        setAuthButton("Sign In", "<html><p>Authenticate to the CCG.</p><html>");
    }
}