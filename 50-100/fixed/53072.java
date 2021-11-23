private void logUnknownPacket(byte[] data, int len, java.lang.String reason) {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    for (int i = 0; i < len; ++i) {
        s.append(java.lang.String.format("%02X ", data[i]));
    }
    logger.info("{} ({}): {}", reason, bridgeId, s);
}