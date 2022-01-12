private void disconnect(java.lang.String reason) {
    try {
        com.kylegiro.chat.packet.client.PacketDisconnect packet = new com.kylegiro.chat.packet.client.PacketDisconnect(reason);
        outputBuffer.clear();
        packet.writeToBytes(outputBuffer);
        outputBuffer.flip();
        output.write(outputBuffer);
    } catch (java.io.IOException connectionException) {
    } finally {
        try {
            input.close();
            output.close();
            socket.close();
            interrupt();
        } catch (java.io.IOException socketClosingException) {
        }
    }
}