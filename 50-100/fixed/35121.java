private void lockedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
    boolean locked = lockedCheckBox.isSelected();
    edu.oregonstate.carto.mapcomposer.Layer layer = getSelectedMapLayer();
    if (layer != null) {
        this.updating = true;
        try {
            layer.setLocked(locked);
            writeGUI(false);
            addUndoFromNamedComponent(((javax.swing.JComponent) (evt.getSource())));
        } finally {
            this.updating = false;
        }
    }
}