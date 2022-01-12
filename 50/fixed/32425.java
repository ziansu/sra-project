@java.lang.Override
public java.lang.String addListener(java.lang.String ip, java.lang.String appId, tv.bouyguestelecom.fr.bboxapilibrary.callback.IBboxMessage iBboxMessage) {
    mWebSocket = new tv.bouyguestelecom.fr.bboxapilibrary.ws.WebSocket(ip, appId);
    return mWebSocket.addNotifMessage(iBboxMessage);
}