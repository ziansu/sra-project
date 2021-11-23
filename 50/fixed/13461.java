public ch.entwine.weblounge.common.content.ResourceURI getParentURI() throws ch.entwine.weblounge.common.content.MalformedResourceURIException {
    java.lang.String parentPath = getParentPath();
    if (parentPath == null)
        return null;
    
    return new ch.entwine.weblounge.common.impl.content.ResourceURIImpl(type, site, parentPath, null, version);
}