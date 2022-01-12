public static java.lang.String removeLineBreaks(java.lang.String userInput) {
    userInput = userInput.trim().replaceAll(Constant.REGEX_LINE_BREAK, "");
    return userInput;
}