@java.lang.Override
public void bundleChanged(org.apache.jackrabbit.oak.blob.composite.BundleEvent event) {
    if ((event.getType()) == (BundleEvent.STARTED)) {
        org.apache.jackrabbit.oak.blob.composite.CompositeDataStore.LOG.info("FDSS - Bundle {} started, checking for data stores", event.getBundle().getSymbolicName());
        addDataStoresFromBundle(event.getBundle());
    }else
        if ((event.getType()) == (BundleEvent.STOPPING)) {
            traversalStrategy.removeDelegateDataStoresForBundle(event.getBundle());
        }
    
}