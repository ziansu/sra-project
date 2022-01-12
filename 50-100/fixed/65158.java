public void syncAllApps() {
    if ((dropbox.isLinked()) == true) {
        for (final kr.iamghost.kurum.AppConfig app : appConfigs.values()) {
            if (app.checkAllVars())
                new java.lang.Thread() {
                    public void run() {
                        syncApp(app, false);
                    }
                }.start();
            
        }
    }
}