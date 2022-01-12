private com.emc.storageos.isilon.restapi.IsilonExport getIsilonExport(com.emc.storageos.isilon.restapi.IsilonApi isilonApi, java.lang.Integer expId, java.lang.String zoneName) {
    com.emc.storageos.isilon.restapi.IsilonExport exp = null;
    try {
        _log.debug("call getIsilonExport for {} ", expId);
        if (expId != null) {
            exp = isilonApi.getExport(expId.toString());
            _log.debug("call getIsilonExport {}", exp.toString());
        }
    } catch (java.lang.Exception e) {
        _log.error("Exception while getting Export for {}", expId);
    }
    return exp;
}