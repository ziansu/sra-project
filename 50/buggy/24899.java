private void initializePushConnector() {
    if (!(com.xtreme.plugins.XTremePushPlugin.isInitialized)) {
        pushConnector.onStart(getApplicationActivity());
        pushConnector.onResume(getApplicationActivity());
        com.xtreme.plugins.XTremePushPlugin.isInitialized = true;
    }
}