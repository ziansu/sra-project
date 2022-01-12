public final java.util.Set<java.lang.String> getDescendantsOf(java.net.URI parentURI) {
    java.lang.String parentId = getId(parentURI);
    if (parentId == null)
        return new java.util.HashSet<java.lang.String>();
    
    return getDescendantsOf(parentId);
}