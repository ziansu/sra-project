@java.lang.Override
public void run() {
    try {
        org.hubiquitus.hapi.transport.service.ServiceResponse responseWSSupported = org.hubiquitus.hapi.transport.service.ServiceManager.requestService(mEndpoint, org.hubiquitus.hapi.Hubiquitus.INFO, ServiceManager.Method.GET, null);
        java.lang.Boolean WsSupported = org.hubiquitus.hapi.utils.HubiquitusInfosUtils.parseWebSocketSupported(responseWSSupported);
        synchronized(this) {
            mWebSocketSupported = WsSupported;
        }
    } catch (java.io.IOException e) {
        onError(InternalErrorCodes.GET_HUBI_INFOS, e);
    }
    createTransport();
}