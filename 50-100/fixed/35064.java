public java.lang.String getOntologyNamespaceFromId(java.lang.String uri) {
    if (ontologyMappings.containsKey(uri)) {
        return ontologyMappings.get(uri).getNamespace();
    }
    uk.ac.ebi.pride.utilities.ols.web.service.model.Ontology ontology = olsClient.getOntologyFromId(java.net.URI.create(uri));
    if (ontology != null) {
        ontologyMappings.put(ontology.getId(), ontology);
        return ontology.getConfig().getNamespace();
    }
    return null;
}