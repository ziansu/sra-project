private void concatenateName() {
    this.path = ((((((((((new java.io.File("").getAbsolutePath()) + (java.io.File.separator)) + (this.folder)) + (java.io.File.separator)) + (cal.get(java.util.Calendar.YEAR))) + (FILE_SEPARATOR)) + (cal.get(java.util.Calendar.MONTH))) + 1) + (FILE_SEPARATOR)) + (cal.get(java.util.Calendar.DATE))) + "Log.csv";
}