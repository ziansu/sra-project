public edu.asu.domain.Resource getResource(java.lang.String resourcePath) {
    edu.asu.domain.Resource resource = resources.get(resourcePath);
    if (resource == null) {
        resource = new edu.asu.domain.Resource(resourcePath);
        resources.put(resourcePath, resource);
    }
    return resource;
}