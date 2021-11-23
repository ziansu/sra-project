public java.lang.String getRandomString(int length) {
    char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < length; i++) {
        char c = chars[random.nextInt(chars.length)];
        sb.append(c);
    }
    return sb.toString();
}