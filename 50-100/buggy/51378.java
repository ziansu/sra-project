public static byte[] getBodyContent(org.archive.io.warc.WARCRecord record) throws java.io.IOException {
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    java.lang.String line = new java.lang.String(org.apache.commons.httpclient.HttpParser.readLine(record, org.warcbase.data.WARC_HEADER_ENCODING));
    if (line == null) {
        return null;
    }
    org.apache.commons.httpclient.HttpParser.parseHeaders(record, org.warcbase.data.WARC_HEADER_ENCODING);
    record.dump(baos);
    return baos.toByteArray();
}