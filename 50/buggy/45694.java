public org.gearvrf.jassimp.AiMaterial getMeshMaterial(org.gearvrf.GVRAndroidResource androidResource, java.lang.String nodeName, int meshIndex) {
    org.gearvrf.GVRAssimpImporter assimpImporter = org.gearvrf.GVRImporter.readFileFromResources(this, androidResource, org.gearvrf.GVRImportSettings.getRecommendedSettings());
    return assimpImporter.getMeshMaterial(nodeName, meshIndex);
}