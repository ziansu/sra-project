@java.lang.Override
public void keyPressed(java.awt.event.KeyEvent e) {
    if (((remain.length()) == 0) && ((e.getKeyCode()) != (java.awt.event.KeyEvent.VK_ENTER))) {
        e.consume();
        retype();
    }else {
        java.lang.String item = "%d %d 0";
        long curTime = java.lang.System.currentTimeMillis();
        records.add(java.lang.String.format(item, curTime, e.getKeyCode()));
    }
}