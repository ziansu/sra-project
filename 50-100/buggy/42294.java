@java.lang.Deprecated
public static java.lang.String getId(org.semanticweb.owlapi.model.IRI iri) {
    java.lang.String iriString = iri.toString();
    java.lang.String full = org.apache.commons.lang3.StringUtils.removeStart(iriString, OBOUpperVocabulary.OBO);
    java.lang.String replaced;
    if (full.startsWith("#")) {
        replaced = org.apache.commons.lang3.StringUtils.removeStart(full, "#");
    }else {
        replaced = org.apache.commons.lang3.StringUtils.replaceOnce(full, "_", ":");
    }
    return replaced;
}