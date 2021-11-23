public org.ecocean.Occurrence getOccurrence(java.lang.String id) {
    org.ecocean.Occurrence tempShark = null;
    try {
        tempShark = ((org.ecocean.org.ecocean.Occurrence) (pm.getObjectById(pm.newObjectIdInstance(org.ecocean.Occurrence.class, id.trim()), true)));
    } catch (java.lang.Exception nsoe) {
        return null;
    }
    return tempShark;
}