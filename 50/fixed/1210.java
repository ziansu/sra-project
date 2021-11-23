@java.lang.Override
public org.apache.tamaya.spi.ConfigurationContextBuilder removePropertySources(java.util.Collection<java.lang.String> propertySourcesToRemove) {
    for (java.lang.String key : propertySourcesToRemove) {
        this.propertySources.remove(key);
    }
    return this;
}