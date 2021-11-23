@java.lang.Override
public void run() {
    byte[] buffer = new byte[1024];
    java.net.DatagramPacket packet = new java.net.DatagramPacket(buffer, buffer.length);
    isRunning = true;
    while (isRunning) {
        try {
            socket.receive(packet);
            java.lang.String msg = new java.lang.String(buffer, 0, packet.getLength());
        } catch (java.io.IOException e) {
            break;
        }
    } 
}