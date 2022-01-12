public boolean isConfigured(final java.lang.String name) {
    org.runnerup.export.Synchronizer l = synchronizers.get(name);
    return (l == null) || (l.isConfigured());
}