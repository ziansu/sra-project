public void update() {
    game.Game.UI.update();
    game.Game.CAMERA.update();
    if (org.lwjgl.input.Keyboard.isKeyDown(Keyboard.KEY_F11)) {
        try {
            org.lwjgl.opengl.Display.setVSyncEnabled((!(org.lwjgl.opengl.Display.isFullscreen())));
            org.lwjgl.opengl.Display.setFullscreen((!(org.lwjgl.opengl.Display.isFullscreen())));
        } catch (org.lwjgl.LWJGLException e) {
            e.printStackTrace();
        }
    }
    game.Game.STATE.getActiveState().update();
    (game.Game.delta)++;
}