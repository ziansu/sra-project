@java.lang.Override
public boolean keyUp(int keycode) {
    if ((keycode == (Input.Keys.BACK)) || (keycode == (Input.Keys.ESCAPE))) {
        if (((backKey) == true) && (backDown)) {
            if ((gsm.currentState) == 0) {
                quit = true;
                return true;
            }else {
                gsm.startOpenScreen();
                return true;
            }
        }
        backDown = true;
    }
    return false;
}