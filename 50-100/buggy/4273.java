private java.util.List<wywasm.FunctionElement.Param> writeParams(java.util.List<wywasm.Type> params, java.util.List<java.lang.Integer> variableList) {
    int i = 0;
    java.util.List<wywasm.FunctionElement.Param> pars = new java.util.ArrayList<>();
    for (wywasm.Type param : params) {
        variableList.add(i);
        pars.add(factory.createParam(("$" + i), factory.createExprType(getType(param))));
    }
    return pars;
}