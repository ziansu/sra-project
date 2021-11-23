public static java.net.URL getVboxFilePath() throws ngspipesengine.core.exceptions.EngineException {
    java.net.URL url;
    java.io.File file = new java.io.File(((java.lang.System.getProperty("ngspipes.basedir")) + (ngspipesengine.core.utils.Uris.VBOX_FILE_RELATIVE_PATH)));
    if (!(file.exists())) {
        throw new ngspipesengine.core.exceptions.ExecutorImageNotFound();
    }
    try {
        url = file.toURI().toURL();
    } catch (java.net.MalformedURLException ex) {
        throw new ngspipesengine.core.exceptions.EngineException("Error converting executor image filename to URL", ex);
    }
    return url;
}