public static void send(boolean lnp, int data, int size) {
    Emitter.sendGeneric(((data << 1) | (lnp ? 1 : 0)), (size + 1));
}