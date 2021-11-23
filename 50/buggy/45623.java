protected org.openflexo.connie.BindingModel createGraphBindingModel() {
    graphBindingModel = new org.openflexo.connie.BindingModel(getBindingModel());
    parameterBindingVariable = new org.openflexo.connie.BindingVariable(getParameterName(), getParameterType());
    graphBindingModel.addToBindingVariables(parameterBindingVariable);
    return graphBindingModel;
}