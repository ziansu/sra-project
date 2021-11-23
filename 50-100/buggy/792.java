@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    rangesPanel.removeRow(rowNumber);
    removeRowIndex(rowNumber);
    updateRowsIndexes(rowNumber);
    if ((rangesPanel.getNumberOfRows()) == 1) {
        rangesPanel.removeLastElementFromRow(0);
    }
    controller.removeRange(rowNumber, problematicCheckbox.isSelected());
}