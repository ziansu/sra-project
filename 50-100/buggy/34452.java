private void updateNotMasteredRecords(java.lang.String oldGID, java.lang.String newGID) {
    java.util.List<java.util.List<org.talend.dataquality.record.linkage.grouping.swoosh.DQAttribute<?>>> recordsInFirstGroup = groupRows.get(oldGID);
    java.util.List<java.util.List<org.talend.dataquality.record.linkage.grouping.swoosh.DQAttribute<?>>> recordsInNewGroup = groupRows.get(newGID);
    if (recordsInFirstGroup != null) {
        if (recordsInNewGroup == null) {
            groupRows.put(newGID, recordsInFirstGroup);
        }else {
            recordsInNewGroup.addAll(recordsInFirstGroup);
        }
    }
}