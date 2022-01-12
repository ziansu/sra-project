private java.lang.String getWeldPatternsMarks(java.util.List<com.lvg.weldercenter.ui.entities.report.WeldPatternUI> weldPatterns) {
    if ((weldPatterns == null) || (weldPatterns.isEmpty()))
        return constants.GENERIC_NULL_FIELD;
    
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (com.lvg.weldercenter.ui.entities.report.WeldPatternUI wp : weldPatterns) {
        if (result.toString().contains(wp.getMark()))
            continue;
        
        result.append(wp.getMark());
        result.append(constants.GENERIC_SLASH_SEPARATOR);
    }
    deleteLastSeparator(result, constants.GENERIC_SLASH_SEPARATOR);
    return result.toString();
}