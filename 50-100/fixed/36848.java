private java.lang.String calc(java.lang.String input) {
    java.lang.String randomizedInput = "";
    java.util.List<java.lang.String> letters = java.util.Arrays.asList(input.split(""));
    java.util.Collections.shuffle(letters);
    for (java.lang.String i : letters) {
        randomizedInput = randomizedInput + i;
    }
    return randomizedInput;
}