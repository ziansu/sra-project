@java.lang.Override
public void preprocessRdfData(java.io.InputStream[] datasets, de.dfki.km.perspecting.obie.vocabulary.MediaType rdfMimeType, de.dfki.km.perspecting.obie.vocabulary.MediaType fileMimeType, java.lang.String absoluteBaseURI) throws java.lang.Exception {
    this.connection.setAutoCommit(false);
    createDatabase();
    loadRDFData(datasets, rdfMimeType, absoluteBaseURI, fileMimeType);
    connection.commit();
    createIndexes();
    connection.commit();
}