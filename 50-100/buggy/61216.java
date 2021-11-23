public org.apache.commons.lang3.tuple.Pair<java.lang.String, org.semanticweb.owlapi.model.OWLNamedIndividual> createIndividualNonReasoning(java.lang.String modelId, org.semanticweb.owlapi.model.OWLClassExpression ce, java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> annotations, METADATA metadata) throws org.geneontology.minerva.MolecularModelManager.UnknownIdentifierException {
    org.geneontology.minerva.ModelContainer model = checkModelId(modelId);
    org.semanticweb.owlapi.model.OWLNamedIndividual i = createIndividual(model, ce, annotations, false, metadata);
    return org.apache.commons.lang3.tuple.Pair.of(org.geneontology.minerva.util.IdStringManager.getId(i.getIRI()), i);
}