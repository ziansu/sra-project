private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        com.github.kayak.core.Bus b = ((com.github.kayak.core.Bus) (jComboBox1.getSelectedItem()));
        tableModel.add(b);
    } catch (java.lang.Exception ex) {
        com.github.kayak.ui.send.SendFramesTopComponent.logger.log(java.util.logging.Level.WARNING, "No bus was selected");
    }
}