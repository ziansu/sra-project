public void enableOverride(java.lang.Long id) {
    if (id == null) {
        throw new java.lang.IllegalStateException("no override id");
    }
    com.alibaba.dubbo.common.URL oldOverride = findOverrideUrl(id);
    if (oldOverride == null) {
        throw new java.lang.IllegalStateException("Override was changed!");
    }
    if (oldOverride.getParameter("enabled", true)) {
        return ;
    }
    com.alibaba.dubbo.common.URL newOverride = oldOverride.addParameter("enabled", true);
    registryService.unregister(oldOverride);
    registryService.register(newOverride);
}