public org.gearvrf.GVRSceneObject loadModelFromURL(java.lang.String urlString, boolean cacheEnabled) throws java.io.IOException {
    return mImporter.loadModel(urlString, org.gearvrf.GVRImportSettings.getRecommendedSettings(), cacheEnabled, null);
}