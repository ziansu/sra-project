protected void buildChildren(org.apache.sling.api.resource.ResourceResolver resolver, java.lang.String mapPath) {
    org.apache.sling.api.resource.Resource parent = resolver.getResource(mapPath);
    children = org.apache.commons.collections.IteratorUtils.toList(parent.listChildren());
}