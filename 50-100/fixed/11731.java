public org.apache.commons.lang3.tuple.Pair<java.lang.String, org.semanticweb.owlapi.model.OWLNamedIndividual> createIndividual(java.lang.String modelId, java.lang.String cid, java.util.Set<org.semanticweb.owlapi.model.OWLAnnotation> annotations, METADATA metadata) throws org.geneontology.minerva.MolecularModelManager.UnknownIdentifierException {
    org.geneontology.minerva.ModelContainer model = checkModelId(modelId);
    org.semanticweb.owlapi.model.OWLClass cls = getClass(cid, model);
    if (cls == null) {
        throw new org.geneontology.minerva.MolecularModelManager.UnknownIdentifierException(("Could not find a class for id: " + cid));
    }
    org.semanticweb.owlapi.model.OWLNamedIndividual individual = createIndividual(model, cls, annotations, true, metadata);
    return org.apache.commons.lang3.tuple.Pair.of(org.geneontology.minerva.util.IdStringManager.getId(individual), individual);
}