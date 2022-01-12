@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    java.lang.String item = "%d %d 1";
    long curTime = java.lang.System.currentTimeMillis();
    records.add(java.lang.String.format(item, curTime, e.getKeyCode()));
    java.lang.System.out.println(((e.getKeyChar()) + " 1"));
    if (((remain.length()) == 0) && ((e.getKeyCode()) == (java.awt.event.KeyEvent.VK_ENTER))) {
        submit();
    }
}