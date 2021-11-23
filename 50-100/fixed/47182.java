@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    if ((currNode) != null) {
        currNode.setX(((e.getX()) - ((currNode.getDiameter()) / 2)));
        currNode.setY(((e.getY()) - ((currNode.getDiameter()) / 2)));
    }
}