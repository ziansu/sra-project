@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        com.devankuleindiren.mnist.ControlPanel.neuralNetwork.saveWeights(weightsSource.getText());
    } catch (java.io.FileNotFoundException exception) {
        javax.swing.JOptionPane.showMessageDialog(null, "Whoops!", ((weightsSource.getText()) + " could not be found."), javax.swing.JOptionPane.ERROR_MESSAGE);
    } catch (java.io.IOException exception) {
        javax.swing.JOptionPane.showMessageDialog(null, "Whoops!", ((weightsSource.getText()) + " could not be saved to."), javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}