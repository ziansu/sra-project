@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if (canPathBeDrawn) {
        gameClasses.GObject obj = program.getElementAt(e.getX(), e.getY());
        isPlayerSelected = false;
        if (obj == (player)) {
            isPlayerSelected = true;
            java.lang.System.out.println("True");
        }
    }
}