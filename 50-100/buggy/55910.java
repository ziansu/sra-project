public static java.lang.String getProperty(java.lang.String name) {
    if ((com.globalgrupp.greenlight.androidclient.util.ApplicationSettings.properties) == null) {
        try {
            android.content.res.AssetManager assetManager = com.globalgrupp.greenlight.androidclient.util.ApplicationSettings.applicationContext.getAssets();
            java.io.InputStream inputStream = assetManager.open("app.properties");
            com.globalgrupp.greenlight.androidclient.util.ApplicationSettings.properties.load(inputStream);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return com.globalgrupp.greenlight.androidclient.util.ApplicationSettings.properties.getProperty(name);
}