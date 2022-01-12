public static void main(java.lang.String[] args) {
    Game game = new Game();
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    int mapSize;
    Map m = new Map();
    m.size = 30;
    m.generate();
    java.lang.System.out.println("Treasure Game");
    game.askUserForNumOfPlayers(scanner);
    game.askUserForMapSize(scanner);
    game.startGame();
}