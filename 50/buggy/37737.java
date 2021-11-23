public org.eclipse.ecf.provider.jmdns.container.IServiceTypeID[] getServiceTypes() {
    synchronized(lock) {
        return ((org.eclipse.ecf.provider.jmdns.container.IServiceTypeID[]) (serviceTypes.toArray(new org.eclipse.ecf.provider.jmdns.container.IServiceTypeID[]{  })));
    }
}