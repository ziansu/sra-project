public static org.helioviewer.jhv.data.datatype.event.SWEKSupplier getSupplier(java.lang.String supplierName, java.lang.String supplierDisplayName, org.helioviewer.jhv.data.datatype.event.SWEKSource source, java.lang.String db) {
    java.lang.String key = (supplierName + (source.getSourceName())) + db;
    org.helioviewer.jhv.data.datatype.event.SWEKSupplier supp = org.helioviewer.jhv.data.datatype.event.SWEKSupplier.suppliers.get(key);
    if (supp == null) {
        org.helioviewer.jhv.data.datatype.event.SWEKSupplier newSupplier = new org.helioviewer.jhv.data.datatype.event.SWEKSupplier(supplierName, supplierDisplayName, source, db);
        org.helioviewer.jhv.data.datatype.event.SWEKSupplier.suppliers.put(key, newSupplier);
        return newSupplier;
    }
    return supp;
}