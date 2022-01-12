private java.lang.String useChatbotCheckers(java.lang.String input) {
    java.lang.String checkedInput = "";
    if (stupidBot.memeChecker(input)) {
        checkedInput += "\nYou like memes!\n";
    }
    if (stupidBot.contentChecker(input)) {
        checkedInput += "\nYou know my secret topic!n";
    }
    if ((checkedInput.length()) == 0) {
        checkedInput = "I have no idea what you mean about " + input;
    }
    return checkedInput;
}