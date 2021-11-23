protected synchronized void notifyUDPReceived(at.htl.smartrobot.server.utils.UDPReceiveEvent e) {
    for (at.htl.smartrobot.server.utils.UDPReceiveListener l : listeners.getListeners(at.htl.smartrobot.server.utils.UDPReceiveListener.class)) {
        l.onReceive(e);
    }
}