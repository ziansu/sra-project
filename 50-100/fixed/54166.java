private static boolean stopOpenVPN() {
    synchronized(de.blinkt.openvpn.core.OpenVpnManagementThread.active) {
        boolean sendCMD = false;
        for (de.blinkt.openvpn.core.OpenVpnManagementThread mt : de.blinkt.openvpn.core.OpenVpnManagementThread.active) {
            sendCMD = mt.managmentCommand("signal SIGINT\n");
            try {
                if ((mt.mSocket) != null)
                    mt.mSocket.close();
                
            } catch (java.io.IOException e) {
            }
        }
        return sendCMD;
    }
}