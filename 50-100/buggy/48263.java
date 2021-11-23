@java.lang.Override
public void setExpression(org.openflexo.connie.DataBinding<T> expression) {
    if (expression != null) {
        this.expression = new org.openflexo.connie.DataBinding<T>(expression.toString(), this, java.lang.Object.class, DataBinding.BindingDefinitionType.GET);
        expression.setBindingName("expression");
        expression.setMandatory(true);
    }
    notifiedBindingChanged(expression);
}