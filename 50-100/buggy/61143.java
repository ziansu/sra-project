public void sendAdd(java.lang.String baseURI, com.marklogic.semantics.rdf4j.client.Resource subject, com.marklogic.semantics.rdf4j.client.IRI predicate, com.marklogic.semantics.rdf4j.client.Value object, com.marklogic.semantics.rdf4j.client.Resource... contexts) throws com.marklogic.semantics.rdf4j.MarkLogicRdf4jException {
    if (com.marklogic.semantics.rdf4j.client.MarkLogicClient.WRITE_CACHE_ENABLED) {
        timerWriteCache.add(subject, predicate, object, contexts);
    }else {
        getClient().performAdd(baseURI, ((com.marklogic.semantics.rdf4j.client.Resource) (skolemize(subject))), ((com.marklogic.semantics.rdf4j.client.IRI) (skolemize(predicate))), skolemize(object), this.tx, contexts);
    }
}