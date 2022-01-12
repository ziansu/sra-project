public void closeUDP() {
    if ((mMulticastSocket) != null) {
        try {
            mMulticastSocket.leaveGroup(mMulticastAddress);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        mMulticastSocket.close();
        mMulticastSocket = null;
    }
}