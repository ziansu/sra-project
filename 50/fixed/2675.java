protected java.lang.String removeToday(java.lang.String userInput) {
    if (userInput.contains("today")) {
        userInput = userInput.replace("today", "");
    }
    return userInput.trim();
}