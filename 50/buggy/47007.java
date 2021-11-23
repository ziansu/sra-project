public java.lang.String getConfig(java.lang.String param) {
    org.apache.hadoop.conf.Configuration conf = new org.apache.hadoop.conf.Configuration();
    java.lang.String result = conf.get(param);
    return result;
}