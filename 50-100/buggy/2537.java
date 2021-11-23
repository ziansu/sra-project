private java.io.File writeTempPreview(com.ctrip.hermes.core.bo.TopicView topic) {
    try {
        java.io.File f = new java.io.File("/tmp", ((topic.getSchemaId()) + ".avsc"));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(f));
        bw.write(topic.getSchema().getSchemaPreview());
        bw.flush();
        bw.close();
        return f;
    } catch (java.io.IOException e) {
        com.ctrip.hermes.portal.resource.TopicResource.log.warn("Write tmp schema preview failed.", e);
        return null;
    }
}