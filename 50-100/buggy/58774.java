private void updateExistingObject(java.lang.Object obj, java.lang.String containerName) {
    java.util.List<java.lang.Package> packs = obj.getPackages();
    java.lang.Package newPkg = new java.lang.Package();
    newPkg.setName(generateNewPackageName(packs));
    newPkg.setContainerName(containerName);
    if ((obj.getObject_state()) < 50)
        throw new de.uzk.hki.da.core.UserException(de.uzk.hki.da.core.UserException.UserExceptionId.DELTA_RECIEVED_BEFORE_ARCHIVED, "Delta Record für ein nicht fertig archiviertes Objekt");
    
    obj.getPackages().add(newPkg);
}