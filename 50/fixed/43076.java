@java.lang.Override
public java.lang.String addListener(java.lang.String ip, final java.lang.String appId, tv.bouyguestelecom.fr.bboxapilibrary.callback.IBboxMedia iBboxMedia) {
    mWebSocket = new tv.bouyguestelecom.fr.bboxapilibrary.ws.WebSocket(ip, appId);
    return mWebSocket.addNotifChannelListener(iBboxMedia);
}