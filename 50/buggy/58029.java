@java.lang.Override
public void onBegin(java.util.List<org.obiba.magma.VariableEntity> entities, org.obiba.magma.Variable... variables) {
    super.onBegin(entities, variables);
    delegate.onBegin(entities, variables);
}