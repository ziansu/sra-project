@java.lang.Override
protected java.util.Map<java.lang.String, fachlich.ParameterType> getExportParameterTypes() {
    if ((exportParameterTypes) == null) {
        exportParameterTypes = new java.util.HashMap<>();
        exportParameterTypes.put("ENDLEADTME", ParameterType.FIELD);
        exportParameterTypes.put("AV_QTY_PLT", ParameterType.FIELD);
        exportParameterTypes.put("DIALOGFLAG", ParameterType.FIELD);
        exportParameterTypes.put("RETURN", ParameterType.STRUCTURE);
        exportParameterTypes.put("WMDVSX", ParameterType.TABLE);
        exportParameterTypes.put("WMDVEX", ParameterType.TABLE);
    }
    return null;
}