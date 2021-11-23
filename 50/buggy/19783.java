@java.lang.Override
protected com.microsoft.azure.management.compute.implementation.DiskImpl wrapModel(com.microsoft.azure.management.compute.implementation.DiskInner inner) {
    if (inner != null) {
        return new com.microsoft.azure.management.compute.implementation.DiskImpl(inner.name(), inner, this.manager());
    }else {
        return null;
    }
}