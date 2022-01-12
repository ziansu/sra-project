protected void writeToFile(java.io.InputStream entity) throws java.io.IOException {
    org.joda.time.DateTime dateTime = org.joda.time.DateTime.now().toDateTime(org.joda.time.DateTimeZone.UTC);
    java.io.File target = new java.io.File(java.lang.String.format("export_%s.zip", dateTime).replaceAll(":", "_"));
    org.apache.commons.io.FileUtils.copyInputStreamToFile(entity, target);
    fileUri = target.getAbsolutePath();
}