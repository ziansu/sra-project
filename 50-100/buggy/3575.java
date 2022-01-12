protected java.lang.String getCorrectVariableName(org.talend.core.model.properties.ContextItem contextItem, java.lang.String originalVariableName, org.talend.metadata.managment.ui.utils.ExtendedNodeConnectionContextUtils.EHadoopParamName noSqlParam) {
    java.util.Set<java.lang.String> contextVarNames = org.talend.core.model.context.ContextUtils.getContextVarNames(contextItem);
    if ((contextVarNames != null) && (!(contextVarNames.contains(originalVariableName)))) {
        for (java.lang.String varName : contextVarNames) {
            if (varName.endsWith(noSqlParam.name())) {
                return varName;
            }
        }
    }
    return originalVariableName;
}