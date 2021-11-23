@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    final java.lang.String attrName = ((java.lang.String) (evt.getNewValue()));
    if ((attrName != null) && (!(attrName.trim().isEmpty()))) {
        ((org.cytoscape.tableimport.internal.ui.PreviewTablePanel.PreviewTableModel) (getPreviewTable().getModel())).setColumnName(colIdx, attrName);
        getPreviewTable().getColumnModel().getColumn(colIdx).setHeaderValue(attrName);
        updatePreviewTable();
    }
}