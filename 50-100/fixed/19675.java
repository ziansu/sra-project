@java.lang.Override
public void onDisconnect() {
    viewer.showDebugInfo("Disconnect from server...");
    viewer.resetView();
    viewer.showIdleScreen(true);
    if ((player) != null)
        player.skip();
    
    player = null;
    listenBroadcast = new java.lang.Thread(new client.BroadcastListener(server, viewer, this));
    listenBroadcast.start();
}