public static org.openrdf.model.URI buildInstanceLongUri(java.lang.String instanceURI) {
    if (instanceURI.contains(com.ontotext.semantic.core.common.SemanticNamespaceUtil.SHORT_NAMESPACE_SEPARATOR)) {
        throw new com.ontotext.semantic.api.exception.SemanticParseException("Given URI is not in short format");
    }
    java.lang.String[] split = instanceURI.split(com.ontotext.semantic.core.common.SemanticNamespaceUtil.SHORT_NAMESPACE_SEPARATOR);
    org.openrdf.model.Namespace ns = com.ontotext.semantic.core.common.SemanticNamespaceUtil.findNamespace(split[0]);
    return new org.openrdf.model.impl.URIImpl(((ns.getName()) + (split[1])));
}