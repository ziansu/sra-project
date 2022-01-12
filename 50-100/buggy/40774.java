public static java.util.ArrayList<java.lang.String> makeCode(java.util.ArrayList<java.lang.String> list) {
    java.util.ArrayList<java.lang.String> codedList = new java.util.ArrayList<java.lang.String>();
    java.util.Random randomGenerator = new java.util.Random();
    for (int i = 1; i < 9; i++) {
        int randomInt = randomGenerator.nextInt(8);
        java.lang.String colour = list.get(randomInt);
        codedList.add(colour);
    }
    return codedList;
}