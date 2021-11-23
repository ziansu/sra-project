public java.lang.Object[] next() {
    return org.apache.carbondata.processing.newflow.sort.SortStepRowUtil.convertRow(getSortedRecordFromFile(), parameters);
}