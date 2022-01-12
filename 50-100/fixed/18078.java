public void divideRandom() {
    java.util.Random random = new java.util.Random();
    value2 = (random.nextInt((((max) - (min)) + 1))) + (min);
    if (((java.lang.String.valueOf(value2).length()) > 3) || ((value2) == 1)) {
        divideRandom();
    }
}