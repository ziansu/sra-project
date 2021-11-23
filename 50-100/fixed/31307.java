public <T> void getRecords(java.util.List<net.moddity.droidnubekit.responsemodels.DNKRecord> records, DroidNubeKitConstants.kDatabaseType databaseType, final net.moddity.droidnubekit.requests.DNKCallback<java.util.List<T>> callback) {
    java.util.List<java.lang.String> recordNames = new java.util.ArrayList<>();
    for (net.moddity.droidnubekit.responsemodels.DNKRecord record : records) {
        recordNames.add(record.getRecordName());
    }
    getRecordByName(recordNames, databaseType, callback);
}