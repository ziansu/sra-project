@java.lang.Override
public void populateExpression(java.lang.Object objValue, org.opengis.filter.expression.Expression opacity) {
    if (objValue instanceof java.lang.String) {
        java.lang.String sValue = ((java.lang.String) (objValue));
        populateField(sValue);
    }
}