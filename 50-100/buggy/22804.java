private boolean xrefsContainDb(cpath.importer.XReferrable xr, java.lang.String db) {
    for (cpath.importer.Xref x : xr.getXref()) {
        if ((((!(x instanceof cpath.importer.PublicationXref)) && ((x.getDb()) != null)) && ((x.getId()) != null)) && (x.getDb().toLowerCase().startsWith(db))) {
            return true;
        }
    }
    return false;
}