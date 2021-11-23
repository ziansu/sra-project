static void main(java.lang.String tripleFile, java.lang.String queryFile) {
    cscie97.asn1.knowledge.engine.Importer.importTripleFile(tripleFile);
    cscie97.asn1.knowledge.engine.QueryEngine.executeQueryFile(queryFile);
}