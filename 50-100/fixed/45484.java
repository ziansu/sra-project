public void displayValue(final java.lang.Object currentValue2) {
    msi.gama.gui.parameters.IScope scope = msi.gama.gui.parameters.GAMA.obtainNewScope();
    setCurrentValue((evaluateExpression ? expectedType.cast(scope, currentValue2, null, false) : currentValue2));
    text.setText(msi.gama.common.util.StringUtils.toGaml(currentValue2, false));
    msi.gama.gui.parameters.GAMA.releaseScope(scope);
}