@java.lang.Override
protected void map(K unused, org.apache.hadoop.io.Text urlText, edu.cornell.library.lc_converter.mapreduce.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String urlString = urlText.toString();
    java.io.InputStream is = edu.cornell.library.lc_converter.mapreduce.MarcConversionMapper.getUrl(urlString);
    java.util.HashSet<java.lang.String> marcRecords = this.marcxmlCollectionParser(is).iterator();
    for (java.lang.String marcXml = marcRecords.next(); marcRecords.hasNext(); marcXml = marcRecords.next()) {
        context.write(marcXml, null);
    }
}