private static org.apache.manifoldcf.agents.output.lucene.LuceneClient newClient(java.lang.String path, java.lang.String charfilters, java.lang.String tokenizers, java.lang.String filters, java.lang.String analyzers, java.lang.String fields, java.lang.String idField, java.lang.String contentField) throws java.lang.Exception {
    org.apache.manifoldcf.agents.output.lucene.LuceneClient client = new org.apache.manifoldcf.agents.output.lucene.LuceneClient(new java.io.File(path).toPath(), charfilters, tokenizers, filters, analyzers, fields, idField, contentField);
    org.apache.manifoldcf.agents.output.lucene.LuceneClientManager.clients.put(path, client);
    return client;
}