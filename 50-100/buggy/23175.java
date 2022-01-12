boolean isChecksumValid() {
    int fileChecksum = readBEIntFrom(0);
    int count = _mapContent.length;
    int currentChecksum = 0;
    for (int i = 8; i < count; i += 4) {
        int currentInt = readBEIntFrom(i);
        currentChecksum = (currentChecksum >>> 31) | ((currentChecksum << 1) ^ currentInt);
    }
    return currentChecksum == fileChecksum;
}