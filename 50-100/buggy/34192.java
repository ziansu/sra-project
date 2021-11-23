@java.lang.Override
public void compute() throws java.lang.Exception {
    conceptPreUpdates = new com.wci.umls.server.jpa.content.ConceptJpa(getConcept(), false);
    com.wci.umls.server.model.content.Concept updateConcept = new com.wci.umls.server.jpa.content.ConceptJpa(getConcept(), false);
    updateConcept.setWorkflowStatus(this.workflowStatus);
    updateConcept(updateConcept);
    conceptPostUpdates = new com.wci.umls.server.jpa.content.ConceptJpa(getConcept(), false);
}