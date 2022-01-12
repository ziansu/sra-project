@java.lang.Override
public void bundleChanged(org.osgi.framework.BundleEvent event) {
    if ((event.getType()) == (org.osgi.framework.BundleEvent.RESOLVED)) {
        registerTranslations(event.getBundle());
    }else
        if ((event.getType()) == (org.osgi.framework.BundleEvent.UNINSTALLED)) {
            unregisterTranslations(event.getBundle());
        }
    
}