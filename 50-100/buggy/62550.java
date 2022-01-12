private static byte[] getRoundKey(byte[] key, int round) {
    byte[] newKey = new byte[key.length];
    for (int i = 0; i < (key.length); i++) {
        newKey[i] = ((byte) ((key[i]) << round));
    }
    for (byte x : newKey) {
        java.lang.System.out.print((x + "  "));
    }
    java.lang.System.out.println("");
    return newKey;
}