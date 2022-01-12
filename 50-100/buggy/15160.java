public static java.lang.String generateKey() {
    java.util.Random random = new java.util.Random();
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (int i = 0; i < 9; i++) {
        builder.append(skull.util.RandomKeyUtil.CHARACTERS[random.nextInt(9)]);
    }
    builder.append(((random.nextInt(8)) + 1));
    return builder.toString();
}