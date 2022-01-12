public static boolean createVector(int modelId, java.lang.String vectorName, java.util.Map<java.lang.String, java.lang.String> vectorConfig, edu.mit.csail.db.ml.server.storage.metadata.MetadataDb metadataDb) {
    return metadataDb.createVector(modelId, vectorName, vectorConfig);
}