public byte[] readEncoder(int encoder, int bytes) {
    byte[] wantedData = new byte[bytes];
    for (int i = 0; i < bytes; i++) {
        wantedData[i] = encoderData.get(encoder).get(0);
        encoderData.get(encoder).remove(0);
    }
    return wantedData;
}