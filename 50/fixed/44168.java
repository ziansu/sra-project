@java.lang.Override
public org.apache.jena.iri.IRI resolveSilent(java.lang.String uriStr) {
    if ((resolvedIRIs) == null)
        return resolveSilentNoCache(uriStr);
    else
        return resolveSilentCache(uriStr);
    
}