@java.lang.Override
public int init() {
    try {
        mSocket = new java.net.DatagramSocket();
        mSocket.setSoTimeout(5000);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return 0;
}