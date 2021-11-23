@java.lang.Override
protected void map(K unused, org.apache.hadoop.io.Text urlText, edu.cornell.library.lc_converter.mapreduce.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String urlString = urlText.toString();
    java.io.InputStream is = getUrl(urlString);
    java.util.HashSet<java.lang.String> marcRecords = marcxmlCollectionParser(is).iterator();
    for (java.lang.String marcXml = marcRecords.next(); marcRecords.hasNext(); marcXml = marcRecords.next()) {
        context.write(new org.apache.hadoop.io.Text(marcXml), null);
    }
}