@java.lang.Override
public synchronized void windowFocus(boolean focused) {
    if (this.focused = focused) {
        notifyAll();
    }
}