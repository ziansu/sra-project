public void syncAllAppsNotThreaded() {
    if ((dropbox.isLinked()) == true) {
        for (final kr.iamghost.kurum.AppConfig app : appConfigs.values()) {
            if (app.checkAllVars())
                syncApp(app, false);
            
        }
    }
}