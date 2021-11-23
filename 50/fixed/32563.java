private void loadProxyConfiguration() {
    java.lang.String host = org.omegat.util.Preferences.getPreference(Preferences.HTTP_PROXY_HOST);
    int port = java.lang.Integer.parseInt(org.omegat.util.Preferences.getPreference(Preferences.HTTP_PROXY_PORT));
    hostField.setText(host);
    portSpinner.setValue(port);
}