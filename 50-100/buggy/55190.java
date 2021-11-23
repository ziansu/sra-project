@java.lang.Override
public void startClientLobby(java.lang.String addr, java.lang.String name) {
    android.content.Intent mServiceIntent = new android.content.Intent(this, com.semaphore_soft.apps.cypher.networking.ClientService.class);
    mServiceIntent.setData(android.net.Uri.parse(NetworkConstants.SETUP_CLIENT));
    mServiceIntent.putExtra(NetworkConstants.ADDR_EXTRA, addr);
    startService(mServiceIntent);
}