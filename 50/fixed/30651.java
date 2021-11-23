public java.lang.String getDecodedKey(com.github.lbroudoux.elasticsearch.river.s3.connector.S3ObjectSummary summary) {
    try {
        return java.net.URLDecoder.decode(summary.getKey(), "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
        return null;
    }
}