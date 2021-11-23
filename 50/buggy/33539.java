public aQute.bnd.osgi.repository.ResourcesRepository getResourcesRepository() throws java.lang.Exception {
    java.util.List<org.osgi.resource.Resource> resources = getResources();
    return new aQute.bnd.osgi.repository.ResourcesRepository(resources);
}