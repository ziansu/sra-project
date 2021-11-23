private int selectRandomIndex(java.lang.String value) {
    java.util.Random generator = new java.util.Random();
    return generator.nextInt(value.length());
}