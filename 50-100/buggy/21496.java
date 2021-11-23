@java.lang.Override
public void resetDescriptions() {
    while ((descriptionGrid.getRowCount()) > 3) {
        descriptionGrid.removeRow(((descriptionGrid.getRowCount()) - 2));
    } 
    descriptionCombo.setValue(Description.MORPHOLOGY);
    descriptionArea.setText("");
    ranksGrid.setWidget(1, 0, descriptionCombo);
}