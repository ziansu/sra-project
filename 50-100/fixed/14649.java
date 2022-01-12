private void addRow(dtu.cdio_final.shared.dto.FormulaDTO formulas) {
    formulaTable.setWidget(((numberOfRows) + 1), 0, new com.google.gwt.user.client.ui.Label(("" + (formulas.getFormulaID()))));
    formulaTable.setWidget(((numberOfRows) + 1), 1, new com.google.gwt.user.client.ui.Label(formulas.getFormulaName()));
    (numberOfRows)++;
}