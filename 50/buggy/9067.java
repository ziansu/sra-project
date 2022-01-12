public static void checkAlreadyDeclaredVariable(java.lang.String variableName, com.espertech.esper.epl.variable.VariableService variableService) throws com.espertech.esper.epl.expression.core.ExprValidationException {
    if ((variableService.getVariableMetaData(variableName)) != null) {
        throw new com.espertech.esper.epl.expression.core.ExprValidationException(com.espertech.esper.epl.variable.VariableServiceUtil.getAlreadyDeclaredEx(variableName));
    }
}