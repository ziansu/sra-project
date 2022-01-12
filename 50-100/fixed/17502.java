public void run() {
    BackupProtocol bp = new BackupProtocol(vrs, id, fileID, n, repDegree, buffer, size);
    byte[] buff = bp.request().getBytes();
    java.net.DatagramPacket packet = new java.net.DatagramPacket(buff, buff.length, address, data.getLocalPort());
    try {
        data.send(packet);
        java.lang.System.out.println("Sent!");
    } catch (java.io.IOException e) {
        java.lang.System.err.println("Error: Fail sending chunk");
    }
}