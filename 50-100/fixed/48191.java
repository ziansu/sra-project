public java.util.List<com.mongodb.DBObject> convertCohortsToStorageType(java.util.Map<java.lang.String, org.opencb.biodata.models.variant.VariantSourceEntry> sourceEntries) {
    java.util.List<com.mongodb.DBObject> cohortsStatsList = new java.util.LinkedList<>();
    for (java.lang.String studyIdFileId : sourceEntries.keySet()) {
        org.opencb.biodata.models.variant.VariantSourceEntry sourceEntry = sourceEntries.get(studyIdFileId);
        java.util.List<com.mongodb.DBObject> list = convertCohortsToStorageType(sourceEntry.getCohortStats(), java.lang.Integer.parseInt(sourceEntry.getStudyId()));
        cohortsStatsList.addAll(list);
    }
    return cohortsStatsList;
}