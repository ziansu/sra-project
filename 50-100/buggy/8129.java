public void valueChanged(javax.swing.event.ListSelectionEvent event) {
    if (event.getValueIsAdjusting()) {
        return ;
    }
    int[] selectedRows = table.getSelectedRows();
    java.lang.String id = ((java.lang.String) (table.getValueAt(selectedRows[0], 0)));
    java.lang.Double xPosition = eventDataIDPositionMap.get(id.trim());
    mainFrame.getGraph().showEventVerticalPosition(xPosition);
}