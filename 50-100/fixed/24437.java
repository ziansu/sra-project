public int read(int mode, int retryMax) {
    for (int i = 0; i < retryMax; i++) {
        java.nio.ByteBuffer rawData = super.readBuffer();
        if (rawData != null) {
            int msgMode = rawData.getInt(0);
            int value = rawData.getInt(1);
            cachedValues[msgMode] = value;
            if (msgMode == mode) {
                return value;
            }
        }
    }
    return cachedValues[mode];
}