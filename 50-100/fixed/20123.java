public static byte[] XOR(byte key, java.lang.String line) {
    try {
        byte[] clear = line.getBytes("UTF8");
        byte[] clouded = new byte[clear.length];
        int i = 0;
        for (byte b : clear) {
            clouded[(i++)] = ((byte) (b ^ key));
        }
        return clouded;
    } catch (java.io.UnsupportedEncodingException e) {
        return null;
    }
}