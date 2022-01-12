public static com.hp.hpl.jena.rdf.model.Model readNTripleStringToJenaModel(java.lang.String triples) {
    com.hp.hpl.jena.rdf.model.Model model = null;
    model = com.hp.hpl.jena.rdf.model.ModelFactory.createDefaultModel();
    java.io.InputStream is = new java.io.ByteArrayInputStream(triples.getBytes());
    model.read(is, null, "N-TRIPLE");
    try {
        is.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return model;
}