public static void printOptions(Player p1, Player p2) {
    java.lang.System.out.println();
    java.lang.System.out.printf(((Functions.CENTER) + "1. Change the size of the Board (Curr : %d)"), Game.boardSize);
    java.lang.System.out.println();
    java.lang.System.out.printf(((Functions.CENTER) + "2. Change the starting player (Curr : %s)"), (p1.isStarting ? Game.RED : Game.BLUE));
    java.lang.System.out.println();
    java.lang.System.out.println(((Functions.CENTER) + "3. Back"));
    Functions.printBlanks(2);
}