private static boolean getBooleanParamValue(final org.talend.core.model.process.INode node, java.lang.String paramName) {
    org.talend.core.model.process.IElementParameter parameter = node.getElementParameter("USE_INDEPENDENT_PROCESS");
    if ((parameter != null) && ((parameter.getValue()) != null)) {
        return java.lang.Boolean.parseBoolean(parameter.getValue().toString());
    }
    return false;
}