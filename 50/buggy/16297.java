private void generateSex() {
    java.util.Random randomSex = new java.util.Random();
    chosenSex = randomSex.nextBoolean();
    if ((chosenSex) == true) {
        sex = "Male";
    }else {
        sex = "Female";
    }
    java.lang.System.out.println(sex);
}