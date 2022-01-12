@java.lang.Override
public void keyTyped(java.awt.event.KeyEvent ev) {
    char keyPressed = ev.getKeyChar();
    char q = 'q';
    char o = 'o';
    if (keyPressed == q) {
        java.lang.System.exit(0);
    }else
        if (keyPressed == o) {
            com.Heather.GameOptionsGui options = new com.Heather.GameOptionsGui();
        }
    
}