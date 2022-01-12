public boolean containsReference(org.semanticweb.owlapi.model.OWLAnnotationProperty property) {
    if (OWLRDFVocabulary.BUILT_IN_ANNOTATION_PROPERTY_IRIS.contains(property.getIRI())) {
        return true;
    }
    return internals.containsOwlAnnotationProperty(property);
}