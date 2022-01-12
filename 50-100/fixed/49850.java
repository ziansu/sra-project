public void registerResource(R resource, org.openflexo.foundation.resource.RepositoryFolder<R, I> parentFolder) {
    if (resource == null) {
        org.openflexo.foundation.resource.ResourceRepository.logger.warning("Trying to register a null resource");
        return ;
    }
    resource.setResourceCenter(getResourceCenter());
    parentFolder.addToResources(resource);
    resources.put(resource.getURI(), resource);
}