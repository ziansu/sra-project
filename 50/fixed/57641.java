@java.lang.Override
public java.lang.Object getValue(org.openflexo.connie.BindingVariable variable) {
    if (variable.getVariableName().equals("component")) {
        return getCustomComponent();
    }
    return super.getValue(variable);
}