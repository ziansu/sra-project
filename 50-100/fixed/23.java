public static void initializeGame() {
    java.lang.System.out.println("Setting up players...");
    Engine.initializePlayers();
    java.lang.System.out.println("Setting up deck...");
    Engine.initializeDeck();
    java.lang.System.out.println("Shuffling cards...");
    Engine.shuffle();
    java.lang.System.out.println("Dealing hands...");
    Engine.deal();
    java.lang.System.out.println("Setting up initial bets...");
    Engine.initializeBets();
    java.lang.System.out.println("");
    return ;
}