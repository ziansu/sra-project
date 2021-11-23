public void closeUDP() {
    if ((mMulticastSocket) != null) {
        java.net.MulticastSocket s = mMulticastSocket;
        mMulticastSocket = null;
        try {
            s.leaveGroup(mMulticastAddress);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        s.close();
    }
}