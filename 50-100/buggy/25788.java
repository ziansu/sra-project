public void performClear(com.marklogic.semantics.rdf4j.client.Transaction tx, com.marklogic.semantics.rdf4j.client.Resource... contexts) {
    if (com.marklogic.semantics.rdf4j.client.MarkLogicClientImpl.notNull(contexts)) {
        for (int i = 0; i < (contexts.length); i++) {
            if (com.marklogic.semantics.rdf4j.client.MarkLogicClientImpl.notNull(contexts[i])) {
                graphManager.delete(contexts[i].stringValue(), tx);
            }else {
                graphManager.delete(com.marklogic.semantics.rdf4j.client.MarkLogicClientImpl.DEFAULT_GRAPH_URI, tx);
            }
        }
    }else {
        graphManager.delete(com.marklogic.semantics.rdf4j.client.MarkLogicClientImpl.DEFAULT_GRAPH_URI, tx);
    }
}