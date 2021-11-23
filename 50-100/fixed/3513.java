public java.lang.String getLatestVersion(java.io.File db) {
    try {
        com.fasterxml.jackson.databind.type.CollectionLikeType constructCollectionLikeType = se.light.assembly64.Utils.mapper.getTypeFactory().constructCollectionLikeType(java.util.List.class, java.lang.String.class);
        java.util.List<java.lang.String> versions = se.light.assembly64.Utils.mapper.readValue(org.apache.commons.io.FileUtils.readFileToString(db), constructCollectionLikeType);
        return versions.get(0);
    } catch (java.lang.Exception e) {
        return null;
    }
}