@java.lang.Override
public void bundleChanged(org.apache.jackrabbit.oak.blob.composite.BundleEvent event) {
    if ((event.getType()) == (BundleEvent.STARTED)) {
        addDataStoresFromBundle(event.getBundle());
    }else
        if ((event.getType()) == (BundleEvent.STOPPING)) {
            traversalStrategy.removeDelegateDataStoresForBundle(event.getBundle());
        }
    
}