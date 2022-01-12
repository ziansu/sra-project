private static boolean stopOpenVPN() {
    synchronized(de.blinkt.openvpn.core.OpenVpnManagementThread.active) {
        boolean sendCMD = false;
        for (de.blinkt.openvpn.core.OpenVpnManagementThread mt : de.blinkt.openvpn.core.OpenVpnManagementThread.active) {
            mt.managmentCommand("signal SIGINT\n");
            sendCMD = true;
            try {
                if ((mt.mSocket) != null)
                    mt.mSocket.close();
                
            } catch (java.io.IOException e) {
            }
        }
        return sendCMD;
    }
}