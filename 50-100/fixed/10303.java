public void init() {
    org.mycat.netty.NettyServer.logger.info("nettyServer init");
    try {
        org.mycat.netty.NettyServer.logger.info("{} server init ddal-engine from {}", getServerName(), SysProperties.ENGINE_CONFIG_LOCATION);
        java.util.Properties prop = new java.util.Properties();
        org.mycat.netty.NettyServer.logger.info("{} server ddal-engine inited.", getServerName());
    } catch (java.lang.Exception e) {
        org.mycat.netty.NettyServer.logger.error("Exception happen when init ddal-engine ", e);
        if (e instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) (e));
        }
        throw new java.lang.RuntimeException(e);
    }
}