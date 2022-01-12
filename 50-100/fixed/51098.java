public void sendDeviceFound(java.lang.String name, java.lang.String address) {
    android.content.Intent i = new android.content.Intent("p2pservice");
    i.putExtra("message", com.example.arch.mobell.P2pService.Broadcasts.onDeviceFound);
    i.putExtra("name", name);
    i.putExtra("mac", address);
    sendBroadcast(i);
}