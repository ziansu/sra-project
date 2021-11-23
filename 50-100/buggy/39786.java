private void visibleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
    boolean visible = visibleCheckBox.isSelected();
    edu.oregonstate.carto.mapcomposer.Layer layer = getSelectedMapLayer();
    if (layer != null) {
        this.updating = true;
        try {
            layer.setVisible(visible);
            writeGUI();
            reloadHTMLPreviewMap();
            addUndoFromNamedComponent(((javax.swing.JComponent) (evt.getSource())));
        } finally {
            this.updating = false;
        }
    }
}