private int signatureOffset() {
    return ((((((1 + 1) + 4) + 2) + 32) + (+8)) + 8) + (useNQT() ? (8 + 8) + 32 : (4 + 4) + 8);
}