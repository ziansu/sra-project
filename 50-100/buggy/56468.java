@java.lang.Override
public void handleStatement(org.openrdf.model.Statement st) throws org.openrdf.rio.RDFHandlerException {
    if (((previous) != null) && ((net.trustyuri.rdf.StatementComparator.compareStatement(previous, st)) > 0)) {
        throw new java.lang.RuntimeException("File not sorted");
    }
    net.trustyuri.rdf.RdfHasher.digest(st, md);
    previous = st;
}