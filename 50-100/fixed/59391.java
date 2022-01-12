public static org.geneontology.minerva.json.JsonAnnotation create(org.semanticweb.owlapi.model.OWLAnnotationProperty p, org.semanticweb.owlapi.model.OWLAnnotationValue value) {
    org.geneontology.minerva.util.IdStringManager.AnnotationShorthand annotationShorthand = org.geneontology.minerva.util.IdStringManager.AnnotationShorthand.getShorthand(p.getIRI());
    if (annotationShorthand != null) {
        return org.geneontology.minerva.json.JsonTools.create(annotationShorthand.getShorthand(), value);
    }
    return org.geneontology.minerva.json.JsonTools.create(p.getIRI().toString(), value);
}