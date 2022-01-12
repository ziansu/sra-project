private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {
    java.awt.Color color = javax.swing.JColorChooser.showDialog(rootPane, "Select Color", java.awt.Color.black);
    if ((canvasPanel1.getCanvas().getSelectedShape()) != null) {
        canvasPanel1.getCanvas().getSelectedShape().setColor(color);
    }
    canvasPanel1.repaint();
}