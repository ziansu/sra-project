private void connect() {
    com.microsoft.graph.connect.AuthenticationManager mgr = com.microsoft.graph.connect.AuthenticationManager.getInstance();
    mgr.setContextActivity(this);
    mgr.startAuthorizationFlow();
}