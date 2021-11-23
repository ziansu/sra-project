private static java.lang.String generateLargeText() {
    java.util.Random charRandom = new java.util.Random(1L);
    int charactersCount = 10000000;
    java.lang.StringBuilder sb = new java.lang.StringBuilder(charactersCount);
    for (int i = 0; i < charactersCount; i++) {
        int charCode = charRandom.nextInt(255);
        sb.append(((char) (charCode)));
    }
    return sb.toString();
}