public org.osgi.framework.ServiceReference getServiceReference(java.lang.String clazz) {
    org.osgi.framework.ServiceReference[] references;
    try {
        references = getServiceReferences(clazz, null);
        if ((references == null) || ((references.length) == 0)) {
            return null;
        }
        java.util.Arrays.sort(references);
        return references[((references.length) - 1)];
    } catch (org.osgi.framework.InvalidSyntaxException e) {
        throw new java.lang.Error("Invalid filter syntax thrown for null filter.", e);
    }
}