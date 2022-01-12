public void windowClosed(java.awt.event.WindowEvent e) {
    imgPlus.setImage(imgCurrent);
    imgPlus.getCanvas().removeMouseListener(this);
    imgPlus.getCanvas().removeMouseMotionListener(this);
    imgPlus.getCanvas().setCursor(hourglassCursor);
    for (java.awt.event.MouseListener ml : mouseListers)
        imgPlus.getCanvas().addMouseListener(ml);
    
    for (java.awt.event.MouseMotionListener mml : mouseMotionListers)
        imgPlus.getCanvas().addMouseMotionListener(mml);
    
    this.setVisible(false);
    this.setEnabled(false);
}