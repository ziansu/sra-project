public byte[] readEncoder(int encoder, int bytes) {
    byte[] wantedData = new byte[bytes];
    for (int i = 0; i < bytes; i++) {
        wantedData[i] = encoderData[encoder].get(0);
        encoderData[encoder].remove(0);
    }
    return wantedData;
}