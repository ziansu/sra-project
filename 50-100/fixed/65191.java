@java.lang.Override
java.lang.String Solve(java.lang.String parameterList) throws java.lang.Exception {
    java.util.HashMap<java.lang.String, Calculator.Variable> custom_paramter = reflectionFunction.onParseParamter(parameterList, request, getCalculator());
    if (custom_paramter == null)
        Parse(parameterList);
    else
        paramter = custom_paramter;
    
    return reflectionFunction.onReflectionFunction(paramter, getCalculator());
}