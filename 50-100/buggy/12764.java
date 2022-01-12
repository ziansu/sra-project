public com.digitalpebble.storm.crawler.Metadata getMetaForOutlink(java.lang.String sourceURL, com.digitalpebble.storm.crawler.Metadata parentMD) {
    com.digitalpebble.storm.crawler.Metadata md = filter(parentMD);
    if (trackPath) {
        md.addValue(com.digitalpebble.storm.crawler.util.MetadataTransfer.urlPathKeyName, sourceURL);
    }
    if (trackDepth) {
        java.lang.String existingDepth = md.getFirstValue(com.digitalpebble.storm.crawler.util.MetadataTransfer.depthKeyName);
        int depth = 0;
        try {
            depth = java.lang.Integer.parseInt(existingDepth);
        } catch (java.lang.Exception e) {
            depth = 0;
        }
        md.setValue(com.digitalpebble.storm.crawler.util.MetadataTransfer.depthKeyName, java.lang.Integer.toString((depth++)));
    }
    return md;
}