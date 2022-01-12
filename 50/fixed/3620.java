@java.lang.Override
public void windowClosed(java.awt.event.WindowEvent e) {
    if (relayBoard.isConnected()) {
        ve.com.soted.softparkmulti.views.SoftParkMultiView.log.info(("Relay Board disconnected=" + (relayBoard.disconnect())));
    }
}