private void show() {
    try {
        runConf = org.mdpnp.apps.testapp.Configuration.searchAndLoadSettings(org.mdpnp.apps.testapp.Main.searchPath);
        d = org.mdpnp.apps.testapp.ConfigurationDialog.showDialog(runConf, this);
        return ;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}