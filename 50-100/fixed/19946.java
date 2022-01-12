public void newFile() {
    drawarea.shapes.removeAllElements();
    drawarea.isSelected = false;
    drawarea.setCurrentCmd(3);
    drawarea.setColor(java.awt.Color.black);
    drawarea.setStroke(1);
    drawarea.selected = 0;
    drawarea.createNewitem();
    drawarea.repaint();
}