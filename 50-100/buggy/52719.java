public static org.semanticweb.owlapi.model.OWLOntology loadOntology(java.lang.String[] resources) throws java.io.FileNotFoundException, org.semanticweb.owlapi.model.OWLOntologyCreationException {
    org.semanticweb.owlapi.model.OWLOntology ontology = null;
    org.semanticweb.owlapi.model.OWLOntologyManager manager = org.semanticweb.owlapi.apibinding.OWLManager.createOWLOntologyManager();
    for (java.lang.String res : resources) {
        ontology = org.drools.shapes.terms.generator.util.Loader.loadOntologyPiece(res, manager);
    }
    return ontology;
}