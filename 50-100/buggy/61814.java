private void drawingPanelMouseClicked(java.awt.event.MouseEvent evt) {
    if (horaireEstCharge) {
        if ((evt.getClickCount()) == 2) {
            horaireController.verificationSelection(evt.getPoint().x, evt.getPoint().y);
            if (horaireController.existeSelection()) {
                fenetreModification = new planifticateur.gui.Modifications(this.horaireController);
                fenetreModification.setVisible(true);
            }
        }
    }
}