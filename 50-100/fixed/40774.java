public static java.util.ArrayList<java.lang.String> makeCode(java.util.ArrayList<java.lang.String> list, int length) {
    java.util.ArrayList<java.lang.String> codedList = new java.util.ArrayList<java.lang.String>();
    java.util.Random randomGenerator = new java.util.Random();
    for (int i = 1; i < (length + 1); i++) {
        int randomInt = randomGenerator.nextInt(length);
        java.lang.String colour = list.get(randomInt);
        codedList.add(colour);
    }
    return codedList;
}