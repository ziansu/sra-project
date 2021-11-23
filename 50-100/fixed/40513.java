@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent event) {
    if ((currentTool) != null) {
        currentTool.onClick(frame, level, ((event.getX()) / (PP.SZ)), ((event.getY()) / (PP.SZ)));
        frame.repaint();
    }
}