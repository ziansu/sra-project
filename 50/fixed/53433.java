public static int getMouseYInWorld() {
    return ((int) (((Globals.player.physics.getCenterY()) + ((Gdx.graphics.getHeight()) / 2)) - (org.egordorichev.lasttry.input.InputManager.getMousePosition().y)));
}