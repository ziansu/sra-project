private java.lang.String getNdtDocs(java.util.List<com.lvg.weldercenter.ui.entities.report.NDTDocumentUI> ndtDocumentUIList) {
    if (ndtDocumentUIList == null)
        return constants.GENERIC_NULL_FIELD;
    
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (com.lvg.weldercenter.ui.entities.report.NDTDocumentUI ndt : ndtDocumentUIList) {
        result.append(ndt.getName());
        result.append("; ");
    }
    deleteLastSeparator(result, constants.GENERIC_SEMICOLON_SEPARATOR);
    return result.toString();
}