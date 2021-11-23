private void disconnectServer() {
    if ((connThread) != null)
        connThread.interrupt();
    
    conn = null;
    connThread = null;
    sendMessage(com.scottmckittrick.arduinoserverclientlib.TCPService.ServerService.MSG_SERVER_DISCONNECTED, null);
}