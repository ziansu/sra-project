public java.lang.String getDocumentTypeNameFromTheStaticList(java.lang.String documentType) {
    for (javax.faces.model.SelectItem localDocumentTypeList : documentTypeList) {
        if (localDocumentTypeList.getValue().equals(documentType)) {
            return localDocumentTypeList.getLabel();
        }
    }
    return "Unknown Document";
}