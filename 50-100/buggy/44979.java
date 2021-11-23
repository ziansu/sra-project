public static final int getMutiClientAllowable(java.lang.String clientID) {
    try {
        java.lang.String accountArea = cn.thinkjoy.im.common.ClientIds.getAccountArea(clientID);
        com.google.common.base.Optional<java.lang.String> kickOrPrevent = com.google.common.base.Optional.of(org.eclipse.moquette.spi.impl.thinkjoy.AccountRepository.get(Constants.KEY_MUTI_CLIENT_ALLOWABLE, accountArea));
        return java.lang.Integer.parseInt(kickOrPrevent.get());
    } catch (java.lang.Exception e) {
        org.eclipse.moquette.spi.impl.thinkjoy.OnlineStateRepository.LOGGER.error(java.lang.String.format("query [mutiClientAllowable] %s fail.", clientID));
        org.eclipse.moquette.spi.impl.thinkjoy.OnlineStateRepository.LOGGER.error(e.getMessage(), e);
        throw new org.eclipse.moquette.proto.MQTTException(("query [mutiClientAllowable] fail:" + clientID));
    }
}