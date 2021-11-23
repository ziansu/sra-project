private java.lang.Integer validateChoice() {
    java.lang.String input = getInput();
    if (isAnInteger(input)) {
        return convertToInt(input);
    }else {
        return null;
    }
}