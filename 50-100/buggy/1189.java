@java.lang.Override
public java.lang.String getSubtitle() {
    if (getUserObject().isAnonymous()) {
        return null;
    }
    java.lang.String s = getUserObject().getOntologyID().getOntologyIRI().toString();
    org.semanticweb.owlapi.model.IRI versionIRI = getUserObject().getOntologyID().getVersionIRI().orNull();
    if (versionIRI != null) {
        s += "<br />" + (versionIRI.toString());
    }
    return s;
}