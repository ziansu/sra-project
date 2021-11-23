public static java.util.Set<org.coode.owlapi.rdf.model.RDFTriple> readTurtle(java.io.InputStream is) throws uk.ac.manchester.cs.owl.owlapi.turtle.parser.ParseException {
    java.util.Set<org.coode.owlapi.rdf.model.RDFTriple> s = new java.util.HashSet<org.coode.owlapi.rdf.model.RDFTriple>();
    uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParser tp = new uk.ac.manchester.cs.owl.owlapi.turtle.parser.TurtleParser(is, new eu.optique.api.mapping.impl.OWLAPIUtil.RDFConsAdapter(s), org.semanticweb.owlapi.model.IRI.create(""));
    tp.parseDocument();
    return s;
}