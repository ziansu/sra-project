public java.lang.String toString() {
    try {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        org.semanticweb.owlapi.model.OWLOntologyManager manager = ontology.getOWLOntologyManager();
        manager.saveOntology(ontology, out);
        return new java.lang.String(out.toByteArray());
    } catch (org.semanticweb.owlapi.model.OWLOntologyStorageException e) {
        return null;
    }
}