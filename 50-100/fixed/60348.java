private boolean checkExpression() {
    boolean bResult = false;
    expFormula = this.cbExpression.getText();
    if ((expFormula.length()) > 0) {
        try {
            bResult = edu.rice.cs.hpc.viewer.metric.DerivedMetric.evaluateExpression(expFormula, varMap, fctMap);
        } catch (com.graphbuilder.math.ExpressionParseException e) {
            org.eclipse.jface.dialogs.MessageDialog.openError(getShell(), "Error: incorrect expression", e.getDescription());
        }
    }else {
        org.eclipse.jface.dialogs.MessageDialog.openError(getShell(), "Error: empty expression", "An expression can not be empty.");
    }
    return bResult;
}