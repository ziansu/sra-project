public static final void remove(final java.lang.String topic) {
    boolean result = org.eclipse.moquette.spi.impl.thinkjoy.TopicRouterRepository.redisRepository.sIsMember(topic, org.eclipse.moquette.spi.impl.thinkjoy.TopicRouterRepository.NODE_ID);
    if (!result) {
        org.eclipse.moquette.spi.impl.thinkjoy.TopicRouterRepository.redisRepository.sRem(topic, org.eclipse.moquette.spi.impl.thinkjoy.TopicRouterRepository.NODE_ID);
    }
    org.eclipse.moquette.spi.impl.thinkjoy.TopicRouterRepository.LOGGER.debug("clean topic [{}] node [{}]", topic, org.eclipse.moquette.spi.impl.thinkjoy.TopicRouterRepository.NODE_ID);
}