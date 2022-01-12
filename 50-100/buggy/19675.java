@java.lang.Override
public void onDisconnect() {
    viewer.showDebugInfo("Disconnect from server...");
    viewer.showIdleScreen(true);
    if ((player) != null)
        player.skip();
    
    player = null;
    viewer.resetView();
    listenBroadcast = new java.lang.Thread(new client.BroadcastListener(server, viewer, this));
    listenBroadcast.start();
}