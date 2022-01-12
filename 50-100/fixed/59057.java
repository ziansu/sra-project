@java.lang.Override
public void setExpression(org.openflexo.connie.DataBinding<? super T> expression) {
    if (expression != null) {
        this.expression = new org.openflexo.connie.DataBinding<java.lang.Object>(expression.toString(), this, java.lang.Object.class, DataBinding.BindingDefinitionType.GET);
        this.expression.setBindingName("expression");
        this.expression.setMandatory(true);
    }
    notifiedBindingChanged(expression);
}