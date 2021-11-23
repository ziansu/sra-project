public void setRecordsByExtension(java.util.Map<java.lang.String, java.lang.Integer> recordsByExtension) {
    if (recordsByExtension != null) {
        this.recordsByExtension = com.google.common.collect.ImmutableMap.copyOf(recordsByExtension);
    }
}