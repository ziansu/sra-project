@java.lang.Override
public boolean scrolled(int amount) {
    for (com.blockhalde.input.VirtualController virtualController : controllers) {
        virtualController.scrolled(amount);
    }
    return false;
}