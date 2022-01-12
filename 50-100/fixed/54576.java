@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    if (javax.swing.SwingUtilities.isLeftMouseButton(e)) {
        board.play(x, y);
    }else
        if (javax.swing.SwingUtilities.isRightMouseButton(e)) {
            board.mark(x, y);
        }
    
}