@java.lang.Override
public void invalidateResult() {
    constantResultField.setText("");
    arrayResultMatrix.setText("", getFormulaList().getDimen());
}