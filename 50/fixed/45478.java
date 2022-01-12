private java.lang.String getUserCommand(java.lang.String userInput) {
    java.lang.String[] temp = userInput.split("\\s+", 2);
    return temp[0].toLowerCase();
}