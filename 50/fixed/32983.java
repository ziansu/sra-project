public static void main(java.lang.String[] args) {
    cscie97.asn1.knowledge.engine.Importer.importTripleFile(args[0]);
    cscie97.asn1.knowledge.engine.QueryEngine.executeQueryFile(args[1]);
}