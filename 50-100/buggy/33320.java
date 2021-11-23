public void findDocType(java.lang.String name) {
    name = name.toLowerCase();
    for (java.lang.String d : docTypeList) {
        if (name.contains(d.toLowerCase())) {
            docType = d.toUpperCase();
        }else {
            docType = "Uncategorized";
        }
    }
}