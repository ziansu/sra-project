public <I> org.openflexo.http.connector.rm.HttpVirtualModelInstanceRepository<I> getVirtualModelInstanceRepository(org.openflexo.foundation.resource.FlexoResourceCenter<I> resourceCenter) {
    org.openflexo.http.connector.rm.HttpVirtualModelInstanceRepository<I> returned = resourceCenter.retrieveRepository(org.openflexo.http.connector.rm.HttpVirtualModelInstanceRepository.class, this);
    if (returned == null) {
        returned = new org.openflexo.http.connector.rm.HttpVirtualModelInstanceRepository<I>(this, resourceCenter);
        resourceCenter.registerRepository(returned, org.openflexo.http.connector.rm.HttpVirtualModelInstanceRepository.class, this);
    }
    return returned;
}