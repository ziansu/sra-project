private java.lang.String getArgument(java.lang.String userInput) {
    int substringStart = (userInput.indexOf(' ')) + 1;
    if (substringStart > 0) {
        int substringEnd = userInput.length();
        return userInput.substring(substringStart, substringEnd).toLowerCase();
    }else {
        return "";
    }
}