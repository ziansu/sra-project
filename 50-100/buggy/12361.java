private void insertToElastic(java.util.Set<java.lang.String> tagList, java.lang.String newFileCheckSum, java.util.ArrayList<java.lang.String> parsedFile, java.lang.String[] locationCoordinates) {
    extractTags(tagList, newFileCheckSum, parsedFile);
    org.elasticsearch.common.xcontent.XContentBuilder json = elasticServer.elasticSearch.putJsonDocument(parsedFile, tagList, locationCoordinates);
    elasticServer.elasticSearch.insert(elasticServer.client, json, "documents", "file");
}