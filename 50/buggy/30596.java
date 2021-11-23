@java.lang.Override
public void keyTyped(java.awt.event.KeyEvent e) {
    synchronized(lock) {
        lock.notify();
        key = e.getKeyChar();
        keyRead = false;
    }
}