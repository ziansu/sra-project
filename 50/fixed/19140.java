public org.gearvrf.GVRSceneObject loadModelFromURL(java.lang.String urlString, java.util.EnumSet<org.gearvrf.GVRImportSettings> settings) throws java.io.IOException {
    return mImporter.loadModel(urlString, settings, true, null);
}