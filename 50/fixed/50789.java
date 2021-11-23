private java.lang.String extractCommand(java.lang.String userInput) {
    if ((userInput.indexOf(' ')) > 0) {
        return userInput.substring(0, userInput.indexOf(' '));
    }else {
        return userInput;
    }
}