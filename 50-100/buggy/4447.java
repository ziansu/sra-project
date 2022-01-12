private java.lang.String createCoreName(java.lang.String caseName) {
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss");
    java.util.Date date = new java.util.Date();
    java.lang.String coreName = (caseName + "_") + (dateFormat.format(date));
    return org.sleuthkit.autopsy.keywordsearch.Index.sanitizeCoreName(coreName);
}