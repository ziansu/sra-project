private org.apache.hadoop.fs.Path getDFSPath(java.lang.String host, java.lang.String fileName) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(dfsBaseDir).append(host).append("/spark/").append(appId).append("/").append(fileName);
    return new org.apache.hadoop.fs.Path(sb.toString());
}