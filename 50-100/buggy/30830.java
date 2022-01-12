private void setUp() {
    com.devankuleindiren.mnist.Image image = null;
    try {
        image = dataLoader.next("mnist_test.csv");
        controlPanel.updateLabel(image.getLabel());
    } catch (java.io.IOException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Whoops!", e.getMessage(), javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    if (image == null) {
        image = new com.devankuleindiren.mnist.Image(28, 28);
    }
    drawingPanel.display(image);
    repaint();
}