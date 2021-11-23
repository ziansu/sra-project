@java.lang.Override
public boolean keyUp(int keycode) {
    if ((keycode == (Input.Keys.BACK)) || (keycode == (Input.Keys.ESCAPE))) {
        goban.stopGame();
        com.ragego.gui.RageGoGame.goHome();
    }
    return false;
}