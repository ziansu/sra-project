public static void initializeCustomWorld(java.util.Scanner input, boolean[][] world) {
    boolean done = false;
    GameOfLife.clearWorld(world);
    java.lang.System.out.printf("Enter a pattern using %c for alive and %c as dead cells.\n", Config.ALIVE, Config.DEAD);
    java.lang.System.out.println("To end the pattern, type END on its own line.");
    for (int i = 0; (i < (Config.WORLD_ROWS)) && (!done); i++) {
        done = GameOfLife.initializeCustomRow(input, i, world);
    }
}