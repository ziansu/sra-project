public java.util.List<domain.dto.DetailedResource> getResources(domain.dto.DetailedResourceType type) {
    return new java.util.ArrayList(manager.getResourceContainer().getResourcesOfType(((domain.ResourceType) (type))));
}