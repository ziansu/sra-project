private void setEngineSessionSoftLimit(java.lang.String engineSessionId, int ttlValue) throws java.io.IOException, javax.naming.NamingException {
    javax.naming.InitialContext context = null;
    try {
        context = new javax.naming.InitialContext();
        org.ovirt.engine.core.aaa.filters.FiltersHelper.getBackend(context).runAction(VdcActionType.SetSesssionSoftLimit, new org.ovirt.engine.core.common.action.SetSesssionSoftLimitCommandParameters(engineSessionId, ttlValue));
    } finally {
        try {
            context.close();
        } catch (javax.naming.NamingException e) {
            org.ovirt.engine.core.aaa.filters.RestApiSessionMgmtFilter.log.error(("Error in REST-API session management. 'Context' object could not be manually closed. " + "This is a cleanup error only; it does not disturb application flow"), e);
        }
    }
}