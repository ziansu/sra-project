@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent event) {
    currentTool.onClick(frame, level, ((event.getX()) / (PP.SZ)), ((event.getY()) / (PP.SZ)));
    frame.repaint();
}