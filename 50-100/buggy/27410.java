public static org.helioviewer.jhv.data.datatype.event.SWEKSupplier getSupplier(java.lang.String supplierName, java.lang.String supplierDisplayName, org.helioviewer.jhv.data.datatype.event.SWEKSource source, java.lang.String db) {
    org.helioviewer.jhv.data.datatype.event.SWEKSupplier supp = org.helioviewer.jhv.data.datatype.event.SWEKSupplier.suppliers.get((supplierName + (source.getSourceName())));
    if (supp == null) {
        org.helioviewer.jhv.data.datatype.event.SWEKSupplier newSupplier = new org.helioviewer.jhv.data.datatype.event.SWEKSupplier(supplierName, supplierDisplayName, source, db);
        org.helioviewer.jhv.data.datatype.event.SWEKSupplier.suppliers.put((supplierName + (source.getSourceName())), newSupplier);
        return newSupplier;
    }
    return supp;
}