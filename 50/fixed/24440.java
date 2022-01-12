public static boolean touch(java.lang.String index) throws java.io.IOException {
    org.elasticsearch.hadoop.mr.RestUtils.ExtendedRestClient rc = new org.elasticsearch.hadoop.mr.RestUtils.ExtendedRestClient();
    boolean result = rc.touch(index);
    rc.close();
    return result;
}