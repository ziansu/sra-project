private int validateChoice() {
    java.lang.String input = getInput();
    int choice;
    if (isAnInteger(input)) {
        choice = convertToInt(input);
    }else {
        choice = 0;
    }
    return choice;
}