public org.semanticweb.owlapi.model.OWLNamedIndividual getIndividual(org.semanticweb.owlapi.model.IRI iri, org.geneontology.minerva.ModelContainer model) {
    boolean containsIRI = model.getAboxOntology().containsEntityInSignature(iri);
    if (containsIRI == false) {
        return null;
    }
    org.semanticweb.owlapi.model.OWLNamedIndividual individual = model.getOWLDataFactory().getOWLNamedIndividual(iri);
    return individual;
}