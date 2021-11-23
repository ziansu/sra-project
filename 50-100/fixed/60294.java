private void refresModifiedMetadataInDatabase(java.util.HashMap<java.lang.String, java.util.ArrayList<fr.ac_versailles.crdp.apiscol.meta.hierarchy.Modification>> modifications) throws fr.ac_versailles.crdp.apiscol.database.DBAccessException, fr.ac_versailles.crdp.apiscol.meta.fileSystemAccess.MetadataNotFoundException {
    java.util.Iterator<java.lang.String> metadataIterator = modifications.keySet().iterator();
    while (metadataIterator.hasNext()) {
        java.lang.String metadataUri = ((java.lang.String) (metadataIterator.next()));
        java.lang.String mdid = metadataUri.replaceAll(getExternalUri().toString(), "").substring(1);
        refreshMetadata(mdid, true, false, true);
    } 
}