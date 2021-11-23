@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("清除")) {
        contentQ[lastClick.y][lastClick.x] = 0;
    }else {
        contentQ[lastClick.y][lastClick.x] = java.lang.Integer.parseInt(e.getActionCommand());
    }
    lastClick = null;
    this.repaint();
}