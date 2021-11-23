public static java.lang.String convertStringToBinary(java.lang.String s) {
    byte[] bytes = s.getBytes();
    java.lang.String result = "";
    for (byte b : bytes) {
        int val = b;
        for (int i = 1; i < 8; i++) {
            result += ((val & 128) == 0) ? 0 : 1;
            val <<= 1;
        }
    }
    return result + "000";
}