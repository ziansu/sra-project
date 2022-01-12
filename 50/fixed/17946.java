@java.lang.Override
public java.lang.String nameTopVariable(java.lang.String signatureVariableName, java.lang.String suffix, java.util.Set<java.lang.String> sqlVariableNames) {
    return nameViewOrVariable("", signatureVariableName, suffix, sqlVariableNames, true);
}