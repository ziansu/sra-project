public org.wso2.carbon.registry.indexing.indexer.Indexer getIndexerForMediaType(java.lang.String mimeType) {
    if (mimeType != null) {
        for (java.util.Map.Entry<java.lang.String, org.wso2.carbon.registry.indexing.indexer.Indexer> entry : registryConfig.getIndexerMap().entrySet()) {
            if (java.util.regex.Pattern.matches(entry.getKey(), mimeType)) {
                return entry.getValue();
            }
        }
    }
    return null;
}