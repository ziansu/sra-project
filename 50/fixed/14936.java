private static void sendByte(boolean rs, int data) {
    Emitter.send(true, ((data << 1) | (rs ? 1 : 0)), 9);
}