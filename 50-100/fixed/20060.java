@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    java.lang.String item = "%d %d 1";
    long curTime = java.lang.System.currentTimeMillis();
    if ((records.size()) > 0) {
        records.add(java.lang.String.format(item, curTime, e.getKeyCode()));
    }
    if (((remain.length()) == 0) && ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_ENTER))) {
        submit();
    }
}