@java.lang.Override
public java.lang.String nameTopVariable(java.lang.String signatureVariableName, java.lang.String suffix, java.util.Set<java.lang.String> sqlVariableNames) {
    return sqlQuote(nameViewOrVariable("", signatureVariableName, suffix, sqlVariableNames));
}