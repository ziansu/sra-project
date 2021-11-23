private void sendReceivedDataToMulticastMessageReceivedHandler(android.os.Messenger handlerMessenger, java.net.DatagramPacket datagramPacket) throws android.os.RemoteException {
    android.os.Message handlerMessage = createHandlerMessage(getReceivedText(datagramPacket));
    handlerMessenger.send(handlerMessage);
}