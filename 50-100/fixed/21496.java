@java.lang.Override
public void resetDescriptions() {
    descriptionCombo.setValue(Description.MORPHOLOGY);
    descriptionArea.setText("");
    descriptionGrid.setWidget(1, 0, descriptionCombo);
    while ((descriptionGrid.getRowCount()) > 3) {
        descriptionGrid.removeRow(((descriptionGrid.getRowCount()) - 2));
    } 
}