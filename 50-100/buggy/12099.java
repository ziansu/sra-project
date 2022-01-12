private void friendName() {
    waitSentence("\"Is this your friend\"?");
    while (nameFriend) {
        waitSentence("\"What is his name?\"");
        java.lang.String userInput = readKeyboardInput.nextLine();
        waitSentence((("\"His name is " + userInput) + "?\""));
        userInput = readKeyboardInput.nextLine();
        if (userInput.equalsIgnoreCase("Yes")) {
            waitSentence("\"Thats a nice name too\"");
            name = false;
        }
    } 
}