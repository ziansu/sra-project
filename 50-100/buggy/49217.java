public com.ctrip.apollo.core.dto.ServiceDTO getConfigService(com.ctrip.apollo.core.enums.Env env) throws com.ctrip.apollo.core.exception.ServiceException {
    java.util.List<com.ctrip.apollo.core.dto.ServiceDTO> services = getServices(env, "config");
    if ((services.size()) == 0) {
        throw new com.ctrip.apollo.core.exception.ServiceException("No available config service");
    }
    return services.get(((configCallCounts.getAndIncrement()) % (services.size())));
}