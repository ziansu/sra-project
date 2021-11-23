@java.lang.Override
public void handleStatement(com.marklogic.semantics.rdf4j.Statement st) throws org.eclipse.rdf4j.rio.RDFHandlerException {
    out.add(st.getSubject().stringValue());
    out.add(st.getPredicate().stringValue());
    out.add(st.getObject().stringValue());
}