private java.util.List<com.hp.hpl.jena.rdf.model.Statement> getInstantiatedShapeTriplets() {
    java.util.List<com.hp.hpl.jena.rdf.model.Statement> statements = new java.util.ArrayList<com.hp.hpl.jena.rdf.model.Statement>();
    statements.addAll(model.listStatements(null, SHACL.nodeShape, ((com.hp.hpl.jena.rdf.model.RDFNode) (null))).toList());
    java.lang.System.out.println(model.listStatements().toList());
    return statements;
}