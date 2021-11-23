@java.lang.Override
public void windowClosed(java.awt.event.WindowEvent e) {
    if (relayBoard.isConnected()) {
        boolean disconnected = relayBoard.disconnect();
        ve.com.soted.softparkmulti.views.SoftParkMultiView.log.info(("Relay Board disconnected=" + disconnected));
    }
}