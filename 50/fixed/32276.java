@java.lang.Override
public org.eclipse.rdf4j.sail.NotifyingSailConnection getConnection() throws org.eclipse.rdf4j.sail.SailException {
    org.eclipse.rdf4j.sail.NotifyingSailConnection connection = super.getConnection();
    if ((si) == null) {
        throw new org.eclipse.rdf4j.sail.SailException("Index is not created");
    }
    return new org.eclipse.rdf4j.lucene.spin.LuceneSpinSailConnection(connection, si);
}