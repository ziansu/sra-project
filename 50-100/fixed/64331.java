void CalcCheckSum(byte[] bytes) {
    bytes[7] = 0;
    for (int i = 0; i < 7; i++) {
        bytes[7] += bytes[i];
    }
    bytes[7] = ((byte) (((bytes[7]) & 255) ^ 165));
}