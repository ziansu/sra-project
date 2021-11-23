@java.lang.Override
public void close() {
    engine.unregisterQuery(csparqlProxy.getId());
    engine.unregisterStream(stream.getIRI());
    engine.destroy();
    engine = null;
}