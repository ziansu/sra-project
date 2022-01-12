public void sendDataToHost(java.lang.String type, java.lang.String data, java.lang.String ip) {
    android.content.Intent serviceIntent = new android.content.Intent(this, com.example.aaup8v2.aaup8v2.wifidirect.HostTransferService.class);
    serviceIntent.setAction(HostTransferService.ACTION_SEND_DATA);
    serviceIntent.putExtra(HostTransferService.EXTRAS_GROUP_OWNER_ADDRESS, info.groupOwnerAddress.getHostAddress());
    serviceIntent.putExtra(HostTransferService.EXTRAS_GROUP_OWNER_PORT, 8888);
    serviceIntent.putExtra(HostTransferService.EXTRAS_DATA, data);
    serviceIntent.putExtra(HostTransferService.EXTRAS_TYPE, type);
    serviceIntent.putExtra(HostTransferService.EXTRAS_SENDER, ip);
    startService(serviceIntent);
}