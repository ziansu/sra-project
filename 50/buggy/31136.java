@java.lang.Override
public void run() {
    logMessage("REDIRECT", ("Loading deploy version: " + uuid));
    prefs.edit().putString("loaded_uuid", uuid).apply();
    webView.loadUrlIntoView(indexLocation, recreatePlugins);
}