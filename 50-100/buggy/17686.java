public java.lang.String generateRandomData(int length) {
    char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.security.SecureRandom random = new java.security.SecureRandom();
    for (int i = 0; i < length; i++) {
        char c = chars[random.nextInt(chars.length)];
        sb.append(c);
    }
    android.util.Log.d("aping", ("randomData: " + (sb.toString())));
    return sb.toString();
}