private synchronized boolean isAnswered(java.awt.event.KeyEvent e) {
    if (((((e.getKeyChar()) == '1') || ((e.getKeyChar()) == '2')) || ((e.getKeyChar()) == '3')) || ((e.getKeyChar()) == '4')) {
        if (!(getAnswer)) {
            getAnswer = true;
            return false;
        }
    }
    return true;
}