public void mousePressed(java.awt.event.MouseEvent arg0) {
    mouseClickedPosition = arg0.getPoint();
    driver.getComponentAt(mouseClickedPosition);
    checkToolbarButtonFocus();
    if (!(com.btwasilow.musicplayer.component.FileButton.getInstance().isSelected())) {
        mousePressedUpdateRoutines();
    }
}