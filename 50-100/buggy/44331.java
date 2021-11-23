public static org.apache.syncope.ide.netbeans.ConnectionParams getConnectionParams() {
    java.util.prefs.Preferences prefs = org.openide.util.NbPreferences.forModule(org.apache.syncope.ide.netbeans.view.ResourceExplorerTopComponent.class);
    org.apache.syncope.ide.netbeans.ConnectionParams connectionParams = org.apache.syncope.ide.netbeans.ConnectionParams.builder().scheme(prefs.get("scheme", "http")).host(prefs.get("host", "localhost")).port(prefs.get("port", "8080")).username(prefs.get("username", StringUtils.EMPTY)).password(prefs.get("password", StringUtils.EMPTY)).build();
    return connectionParams;
}