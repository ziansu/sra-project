public static java.lang.String getRandomString(int length) {
    java.lang.String base = "abcdefghijklmnopqrstuvwxyz0123456789";
    java.util.Random random = new java.util.Random();
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    for (int i = 0; i < length; i++) {
        int number = random.nextInt(base.length());
        sb.append(base.charAt(number));
    }
    return sb.toString();
}