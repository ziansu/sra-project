@java.lang.Override
public void update(final hamster.app.network.NetworkManager networkMgr, final hamster.app.network.SerialOutputEvent event) {
    if ((event.getSource()) != (this)) {
        printLog((("External Input Captured: " + (new java.lang.String(event.output))) + '\n'));
    }
}