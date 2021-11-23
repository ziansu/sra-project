public org.gearvrf.GVRSceneObject loadModelFromURL(java.lang.String urlString, java.util.EnumSet<org.gearvrf.GVRImportSettings> settings) throws java.io.IOException {
    return mImporter.loadModel(urlString, GVRResourceVolume.VolumeType.NETWORK, settings, true, null);
}