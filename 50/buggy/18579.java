public void mergeLoadedKBases() throws java.lang.Exception {
    this.importLoadedSystemsKBases();
    this.saveEFBOValidationOntology();
    this.setEFBOInferredOntology();
    this.saveEFBOInferredOntology();
    this.importEFBOInferredOntology();
}