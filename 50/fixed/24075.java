private void addBundle(final org.osgi.framework.Bundle bundle) {
    try {
        installModule(bundle);
    } catch (final java.lang.Exception t) {
        com.enonic.xp.core.impl.module.ModuleRegistryImpl.LOG.warn(("Unable to load module " + (bundle.getSymbolicName())), t);
    }
}