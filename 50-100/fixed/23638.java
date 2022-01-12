@java.lang.Override
public void bytesRead(java.nio.ByteBuffer inputBuffer, au.id.villar.net.SocketProxy socket) throws java.io.IOException {
    java.lang.String received = new java.lang.String(inputBuffer.array(), inputBuffer.position(), inputBuffer.limit());
    java.lang.System.out.println(("received: " + received));
    socket.close();
    java.lang.Thread.currentThread().interrupt();
}