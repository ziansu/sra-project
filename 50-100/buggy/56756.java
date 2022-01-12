public io.resource.DataRef findCheckSum(java.lang.String checkSum) {
    if ((checkSum == null) || ((checkSum.length()) == 0)) {
        return null;
    }
    for (int i = 0; i < (referenceList.size()); i++) {
        final io.resource.DataRef reference = referenceList.get(i);
        final core.world.WorldResource resource = reference.getResource();
        if (resource.getSHA1CheckSum().equals(checkSum)) {
            return reference;
        }
    }
    return null;
}