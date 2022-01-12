@java.lang.Override
public void storeOntology(org.semanticweb.owlapi.model.OWLOntologyManager manager, org.semanticweb.owlapi.model.OWLOntology ontology, org.semanticweb.owlapi.io.OWLOntologyDocumentTarget target, org.semanticweb.owlapi.model.OWLOntologyFormat ontologyFormat) throws java.io.IOException, org.semanticweb.owlapi.model.OWLOntologyStorageException {
    if (!(ontologyFormat instanceof org.hypergraphdb.app.owl.HGDBOntologyFormat)) {
        throw new org.semanticweb.owlapi.model.OWLOntologyStorageException(("illegal format, need HGDBOntologyFormat, was " + (ontologyFormat.getClass())));
    }
    storeOntology(manager, ontology, target.getDocumentIRI(), ontologyFormat);
}