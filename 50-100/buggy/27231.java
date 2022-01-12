public void mousePressed(java.awt.event.MouseEvent e) {
    if (popupShown) {
        return ;
    }
    if (isInDataArea(e)) {
        mpStart = new java.awt.Point(getCol(e.getPoint()), getRow(e.getPoint()));
        rect = new java.awt.Rectangle(mpStart, new java.awt.Dimension(0, 0));
        eventProducer.fireAreaSelectionEvent(new anl.verdi.plot.gui.AreaSelectionEvent(rect, createAreaString(rect), false));
    }else {
        mpStart = null;
    }
}