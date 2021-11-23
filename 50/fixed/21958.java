private int selectRandomIndex(java.lang.String value) {
    if (value.isEmpty()) {
        return 0;
    }
    java.util.Random generator = new java.util.Random();
    return generator.nextInt(value.length());
}