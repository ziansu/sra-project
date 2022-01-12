private void displayPaneMouseClicked(java.awt.event.MouseEvent evt) {
    if ((this.helixImgGen) != null) {
        java.awt.Point p = evt.getPoint();
        java.awt.Rectangle rect = this.DisplayScrollPane.getViewport().getViewRect();
        double x = p.getX();
        double y = p.getY();
        helixImgGen.setPrimarySelectionLocation(x, y, rect.getSize());
        this.updateImage();
        displayPane.repaint();
    }
}