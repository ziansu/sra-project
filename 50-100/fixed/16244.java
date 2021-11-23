@java.lang.Override
public void onClose(int code, java.lang.String reason) {
    logger.log((((("Websocket closed. Code : " + code) + ", Reason: ") + reason) + "."));
    cleanUp();
    if ((pingTask) != null)
        pingTask.cancel();
    
    if (catchDisconnection)
        disconnectionListener.onDisconnected();
    
}