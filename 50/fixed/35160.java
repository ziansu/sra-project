private java.lang.String getRandomValue() {
    java.util.Random random = new java.util.Random();
    java.util.OptionalInt randomNumber = random.ints(64, 128).findFirst();
    return java.lang.Character.toString(((char) (randomNumber.getAsInt())));
}