@java.lang.Override
public synchronized void windowFocus(boolean focused) {
    this.focused = focused;
    if (focused) {
        notifyAll();
    }
}