@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    setCurrentLayer(layerJList.getSelectedIndex());
    if ((canvasPanel) != null) {
        canvasPanel.repaint();
    }
    selectedObjects.clear();
}