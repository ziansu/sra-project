private java.lang.String getRemoteServerUrl() {
    java.lang.String strUrl = this.strRemoteServerUrl;
    if (strUrl == null) {
        org.jenkinsci.plugins.ParameterizedRemoteTrigger.RemoteJenkinsServer remoteServer = this.findRemoteHost(this.getRemoteJenkinsName());
        strUrl = remoteServer.getAddress().toString();
    }
    return strUrl;
}