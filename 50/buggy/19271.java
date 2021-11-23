@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    callback.getVisualizationState().updateTableRowFilter(null);
    callback.updateVisualizationJustTables();
    callback.resetPickedStateAndUpdateView();
}