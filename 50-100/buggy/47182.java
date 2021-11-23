@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    currNode.setX(((e.getX()) - ((currNode.getDiameter()) / 2)));
    currNode.setY(((e.getY()) - ((currNode.getDiameter()) / 2)));
}