public static void updateFPS() {
    if (((com.nyhammer.newMON.Timer.getTime()) - (com.nyhammer.newMON.Timer.lastFpsTime)) > 1.0) {
        com.nyhammer.newMON.Timer.fps = com.nyhammer.newMON.Timer.fpsCount;
        com.nyhammer.newMON.ui.GameWindow.setTitle(java.lang.String.format("%s | (FPS: %d)", Main.TITLE, com.nyhammer.newMON.Timer.fps));
        com.nyhammer.newMON.Timer.fpsCount = 0;
        (com.nyhammer.newMON.Timer.lastFpsTime)++;
    }
    (com.nyhammer.newMON.Timer.fpsCount)++;
}