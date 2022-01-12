private void send(final byte[] data, final java.net.InetAddress address, final int Port) {
    send = new java.lang.Thread("Send") {
        public void run() {
            java.net.DatagramPacket packet = new java.net.DatagramPacket(data, data.length, address, port);
            try {
                socket.send(packet);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    };
    send.start();
}