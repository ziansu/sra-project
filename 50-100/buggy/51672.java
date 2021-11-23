private java.lang.String calc(java.lang.String input) {
    java.lang.String result = "";
    for (int i = 0; i < (input.length); i++) {
        char textValue = input.charAt(i);
        int intValue = ((int) (textValue)) + 1;
        result += ((char) (intValue));
    }
    return result;
}