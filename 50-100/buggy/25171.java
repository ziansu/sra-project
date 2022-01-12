public java.lang.String getLogFilePath(long offset) {
    int partition = ((int) ((offset / (offsetPerPartition)) * (offsetPerPartition)));
    java.util.ArrayList<java.lang.String> pathElements = new java.util.ArrayList<java.lang.String>();
    pathElements.add(topic);
    pathElements.add(java.lang.Integer.toString(kafkaPartition));
    pathElements.add(("offset=" + partition));
    return org.apache.commons.lang.StringUtils.join(pathElements, "/");
}