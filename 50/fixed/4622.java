@java.lang.Override
public void onConnectionEnd() {
    timer.cancel();
    timer.purge();
    lmo.tcp.bridge.client.BridgeClientForm.logger.info("server connection ended, starting again");
    client.connect();
}