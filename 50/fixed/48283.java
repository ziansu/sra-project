@java.lang.Override
public boolean mouseMoved(int screenX, int screenY) {
    for (com.blockhalde.input.VirtualController virtualController : controllers) {
        virtualController.mouseMoved(screenX, screenY);
    }
    return false;
}