private void disconnect(java.lang.String reason) {
    try {
        if (!(socket.isClosed())) {
            com.kylegiro.chat.packet.client.PacketDisconnect packet = new com.kylegiro.chat.packet.client.PacketDisconnect(reason);
            outputBuffer.clear();
            packet.writeToBytes(outputBuffer);
            outputBuffer.flip();
            output.write(outputBuffer);
            input.close();
            output.close();
            socket.close();
        }
        interrupt();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}