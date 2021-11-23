public void findDocType(java.lang.String name) {
    name = name.toLowerCase();
    docType = "Uncategorized";
    for (java.lang.String d : docTypeList) {
        if (name.contains(d.toLowerCase())) {
            docType = d.toUpperCase();
            break;
        }
    }
}