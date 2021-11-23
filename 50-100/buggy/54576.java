@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    if (javax.swing.SwingUtilities.isLeftMouseButton(e)) {
        if (board.play(x, y)) {
            gui.updateBoard();
        }
    }else
        if (javax.swing.SwingUtilities.isRightMouseButton(e)) {
            board.mark(x, y);
            gui.updateBoard();
        }
    
}