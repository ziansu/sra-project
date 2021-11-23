public void syncAllApps() {
    if ((dropbox.isLinked()) == true) {
        for (final kr.iamghost.kurum.AppConfig app : appConfigs.values()) {
            if (app.checkAllVars())
                org.eclipse.swt.widgets.Display.getDefault().asyncExec(new java.lang.Runnable() {
                    @java.lang.Override
                    public void run() {
                        syncApp(app, false);
                    }
                });
            
        }
    }
}