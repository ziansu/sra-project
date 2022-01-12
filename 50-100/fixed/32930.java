public void saveEFBOInferredOntology() throws java.lang.Exception {
    final java.lang.String inferredEFBOFilePath = (((java.lang.System.getProperty("user.dir")) + "/Resources/Ontologies/") + (EFBOSystemLauncher.PROJECT_NAME)) + "/efbo-inferred.owl";
    inferredOntologyFile = new java.io.File(inferredEFBOFilePath);
    org.semanticweb.owlapi.model.IRI efboInferredIRI = org.semanticweb.owlapi.model.IRI.create(inferredOntologyFile.toURI());
    efboInferredOntology.getOWLOntologyManager().saveOntology(this.efboInferredOntology, efboInferredIRI);
}