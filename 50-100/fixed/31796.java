public boolean containsAnnotationPropertyInSignature(org.semanticweb.owlapi.model.IRI propIRI) {
    if (OWLRDFVocabulary.BUILT_IN_ANNOTATION_PROPERTY_IRIS.contains(propIRI)) {
        return true;
    }
    boolean b = internals.containsOwlAnnotationProperty(getOWLDataFactory().getOWLAnnotationProperty(propIRI));
    if (b) {
        return true;
    }else {
        for (org.semanticweb.owlapi.model.OWLAnnotation anno : internals.getOntologyAnnotations()) {
            if (anno.getProperty().getIRI().equals(propIRI)) {
                return true;
            }
        }
    }
    return false;
}