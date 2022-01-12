public void sendPacket(int id, byte[] content) {
    byte[] message = new byte[(content.length) + 1];
    message[0] = ((byte) (id));
    for (int i = 0; i < (content.length); i++) {
        message[(i + 1)] = content[i];
    }
    java.lang.System.out.println(java.util.Arrays.toString(message));
    send(message);
}