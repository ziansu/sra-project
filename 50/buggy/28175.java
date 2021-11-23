public static void send(boolean lnp, int data, int size) {
    Emitter.sendGeneric((lnp ? (data << 1) | 1 : (data << 1) & 254), (size + 1));
}