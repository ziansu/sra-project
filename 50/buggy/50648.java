@java.lang.Override
public void invalidateResult() {
    constantResultField.getEditText().setText("");
    arrayResultMatrix.setText("", getFormulaList().getDimen());
}