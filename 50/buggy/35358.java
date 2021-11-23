static org.continuousassurance.swamp.cli.SwampApiWrapper login(java.lang.String username, java.lang.String password, java.lang.String hostUrl) throws java.lang.Exception {
    org.continuousassurance.swamp.cli.SwampApiWrapper api = new org.continuousassurance.swamp.cli.SwampApiWrapper(hostUrl);
    api.login(username, password);
    return api;
}