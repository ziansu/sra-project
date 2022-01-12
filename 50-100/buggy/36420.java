@java.lang.Override
public boolean inDomain(final com.hp.hpl.jena.rdf.model.Resource resource) {
    final java.util.HashMap<java.lang.String, java.lang.String> values = new java.util.HashMap<>();
    return (uriTemplate.match(resource.getURI(), values)) && (values.containsKey("path"));
}