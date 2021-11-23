public org.openiot.lsm.security.oauth.LSMRegisteredServiceImpl getRegisteredService(long serviceId) {
    final org.openiot.lsm.security.oauth.LSMRegisteredServiceImpl registeredService = lsmOAuthHttpManager.getRegisteredService(serviceId);
    return registeredService;
}