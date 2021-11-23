private void executeOkCommand() {
    org.knime.core.node.port.database.metadata.model.DBObject selectedObj = m_panel.getSelectedObject();
    if (selectedObj != null) {
        m_selectedObject = selectedObj;
        closeDialog();
    }else {
        javax.swing.JOptionPane.showMessageDialog(this, m_selectionFilter.getErrorMessage(), "Selection not allowed", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}