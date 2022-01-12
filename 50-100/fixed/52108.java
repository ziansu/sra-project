private boolean checkForExistingCompatibleDatatypeProperty(java.lang.String propUri, com.hp.hpl.jena.rdf.model.RDFNode rngNode) {
    com.hp.hpl.jena.ontology.DatatypeProperty prop = getTheJenaModel().getDatatypeProperty(propUri);
    if (prop != null) {
        com.hp.hpl.jena.ontology.OntResource rng = prop.getRange();
        if ((rng != null) && (rng.equals(rngNode))) {
            return true;
        }
    }
    return false;
}