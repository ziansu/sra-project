public static final void put(java.lang.String clientID) {
    try {
        java.lang.String userID = org.eclipse.moquette.spi.impl.thinkjoy.OnlineStateRepository.buildUserID(clientID);
        org.eclipse.moquette.spi.impl.thinkjoy.OnlineStateRepository.redisRepository.sAdd(userID, clientID);
        org.eclipse.moquette.spi.impl.thinkjoy.OnlineStateRepository.LOGGER.info("[User]: is online on [clientID]:{}", userID, clientID);
    } catch (java.lang.Exception e) {
        org.eclipse.moquette.spi.impl.thinkjoy.OnlineStateRepository.LOGGER.error(java.lang.String.format("put [userState] %s fail.", clientID));
        org.eclipse.moquette.spi.impl.thinkjoy.OnlineStateRepository.LOGGER.error(e.getMessage(), e);
    }
}