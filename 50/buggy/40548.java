public void sendPauseStopMessage(android.view.View view) {
    byte[] message = com.example.acer.taxiapp.MessengerClient.getPauseStopMessage(lastLocation, this);
    tcpClientService.sendBytes(message);
}