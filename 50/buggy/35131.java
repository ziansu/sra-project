public java.lang.Object handle() {
    java.lang.String result = request(com.adintellig.ella.hbase.handler.JMXRegionServerHandler.url);
    com.adintellig.ella.hbase.handler.JMXRegionServerHandler.logger.info(("Request URL: " + (com.adintellig.ella.hbase.handler.JMXRegionServerHandler.url)));
    return parseBean(result);
}