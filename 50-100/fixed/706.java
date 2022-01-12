public java.lang.String generateUID(java.util.Random rand) {
    java.lang.String chars = "ABCDEFGHIJKLMNOPQRSTUVWabcdefghijklmnopqrstuvwxyz1234567890";
    java.lang.String result;
    int length = 4;
    char[] text = new char[length];
    for (int i = 0; i < length; i++) {
        text[i] = chars.charAt(rand.nextInt(chars.length()));
    }
    result = new java.lang.String(text);
    return result;
}