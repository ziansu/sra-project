public void setFirstRowAsColumnNames() {
    final org.cytoscape.tableimport.internal.ui.PreviewTablePanel.PreviewTableModel model = ((org.cytoscape.tableimport.internal.ui.PreviewTablePanel.PreviewTableModel) (getPreviewTable().getModel()));
    model.setFirstRowNames(true);
    types = org.cytoscape.tableimport.internal.util.TypeUtil.guessTypes(importType, model, dataTypes, null);
    updatePreviewTable();
    org.cytoscape.util.swing.ColumnResizer.adjustColumnPreferredWidths(getPreviewTable());
}