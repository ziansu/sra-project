private static void sendGeneric(int data, int size) {
    Emitter.initTransmission();
    int mask = 1;
    for (int i = 0; i < size; i++) {
        Emitter.sendBit(((mask & data) != 0));
        mask <<= 1;
    }
}