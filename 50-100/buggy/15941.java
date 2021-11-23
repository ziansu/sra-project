private int slotForKey(java.lang.String key) {
    java.nio.ByteBuffer bytes = java.nio.charset.StandardCharsets.UTF_8.encode(key);
    int sum = 0;
    for (int i : bytes.array()) {
        sum = (sum * 17) + i;
    }
    return sum % (config.getNumSlots());
}