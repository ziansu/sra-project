private java.lang.String createCoreName(java.lang.String caseName) {
    java.lang.String coreName = org.sleuthkit.autopsy.keywordsearch.Index.sanitizeCoreName(caseName);
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss");
    java.util.Date date = new java.util.Date();
    return (coreName + "_") + (dateFormat.format(date));
}