private void sendReceivedDataToMulticastMessageReceivedHandler(android.os.Messenger handlerMessenger, java.lang.String datagramPacket) throws android.os.RemoteException {
    android.os.Message handlerMessage = createHandlerMessage(datagramPacket);
    handlerMessenger.send(handlerMessage);
}