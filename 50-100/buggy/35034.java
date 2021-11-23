@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    com.devankuleindiren.mnist.DataLoader dataLoader = com.devankuleindiren.mnist.DataLoader.getInstance();
    try {
        com.devankuleindiren.mnist.Image image = dataLoader.next(loadImageSource.getText());
        com.devankuleindiren.mnist.DrawingPanel drawingPanel = com.devankuleindiren.mnist.DrawingPanel.getInstance();
        drawingPanel.display(image);
        updateLabel(image.getLabel());
    } catch (java.io.IOException exception) {
        javax.swing.JOptionPane.showMessageDialog(null, "Whoops!", exception.getMessage(), javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}