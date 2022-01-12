public org.sonar.wsclient.Sonar getSonar() {
    java.lang.String host = txtHost.getText();
    java.lang.String user = txtUser.getText();
    java.lang.String password = txtPassword.getPassword().toString();
    return new org.sonar.wsclient.Sonar(new org.sonar.wsclient.connectors.HttpClient4Connector(new org.sonar.wsclient.Host(host, user, password)));
}