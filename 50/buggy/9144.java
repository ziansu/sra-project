@java.lang.Override
public org.geneontology.minerva.json.JsonAnnotation visit(org.semanticweb.owlapi.model.IRI iri) {
    java.lang.String iriString;
    if (useShortId) {
        iriString = org.geneontology.minerva.util.IdStringManager.getId(iri);
    }else {
        iriString = iri.toString();
    }
    return org.geneontology.minerva.json.JsonAnnotation.create(key, iriString, org.geneontology.minerva.json.JsonTools.VALUE_TYPE_IRI);
}