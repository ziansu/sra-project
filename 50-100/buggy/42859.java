@java.lang.Override
public void run() {
    while (true) {
        long preTickTime = java.lang.System.currentTimeMillis();
        zagar.Main.updateGame();
        if (((java.lang.System.currentTimeMillis()) % 100) == 0) {
            Game.fps = 1000 / ((java.lang.System.currentTimeMillis()) - preTickTime);
            Main.frame.setTitle((("· zAgar · " + (Game.fps)) + "fps"));
        }
    } 
}