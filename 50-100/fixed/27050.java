private void callAppLocked() {
    if (!(mDummyPlugin)) {
        if ((mApplicationClient) != null) {
            return ;
        }
        mApplicationClient = com.qihoo360.replugin.component.app.PluginApplicationClient.getOrCreate(mInfo.getName(), mLoader.mClassLoader, mLoader.mComponents, mLoader.mPluginObj.mInfo);
        if ((mApplicationClient) != null) {
            mApplicationClient.callAttachBaseContext(mLoader.mPkgContext);
            mApplicationClient.callOnCreate();
        }
    }else {
        if (com.qihoo360.replugin.helper.LogRelease.LOGR) {
            com.qihoo360.replugin.helper.LogRelease.e(com.qihoo360.replugin.helper.LogDebug.PLUGIN_TAG, ("p.cal dm " + (mInfo.getName())));
        }
    }
}