private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if ((canvasPanel1.getCanvas().getSelectedShape()) != null) {
        java.awt.Color color = javax.swing.JColorChooser.showDialog(rootPane, "Select Color", java.awt.Color.black);
        canvasPanel1.getCanvas().getSelectedShape().setColor(color);
    }
    canvasPanel1.repaint();
}