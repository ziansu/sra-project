public Player.Choice makeChoice() {
    java.util.Scanner keyboard = new java.util.Scanner(java.lang.System.in);
    Player.Choice userChoice;
    java.lang.System.out.print("Would you like to \"hit\" or \"stay?\": ");
    userInput = keyboard.next().trim().toUpperCase();
    java.lang.System.out.println((("\"" + (userInput)) + "\""));
    switch (userInput) {
        case "HIT" :
            userChoice = Player.Choice.HIT;
            break;
        case "STAY" :
            userChoice = Player.Choice.STAY;
            break;
        default :
            java.lang.System.out.print("That option isn't available. ");
            userChoice = Player.Choice.NONE;
            break;
    }
    return userChoice;
}