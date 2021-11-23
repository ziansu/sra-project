@java.lang.Override
public void checkForUpdates(org.w3c.dom.Element element) {
    synchronized(this) {
        if (((!(saving)) && ((configuredObjectReference) != null)) && ((configuredObjectReference.get()) != null)) {
            clearCache();
            this.element = element;
            org.exist.config.Configurator.configure(configuredObjectReference.get(), this);
        }
    }
}