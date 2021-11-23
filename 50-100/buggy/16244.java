@java.lang.Override
public void onClose(int code, java.lang.String reason) {
    logger.log((((("Websocket closed. Code : " + code) + ", Reason: ") + reason) + "."));
    pingTask.cancel();
    cleanUp();
    if (catchDisconnection)
        disconnectionListener.onDisconnected();
    
}