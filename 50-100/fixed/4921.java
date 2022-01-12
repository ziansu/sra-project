@java.lang.Override
public void handleStatement(org.openrdf.model.Statement st) throws org.openrdf.rio.RDFHandlerException {
    (count)++;
    if (((count) % 1000000) == 0) {
        com.github.amihalik.rya.mongo.debugging.serialization.RdfHandlerCounter.log.info(((numberFormat.format(count)) + " statements written"));
    }
    inner.handleStatement(st);
}