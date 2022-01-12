public java.util.HashMap<java.lang.String, java.lang.String> filterDoc(java.lang.String fileName) {
    java.lang.String docContent = readDoc(fileName);
    java.util.HashMap<java.lang.String, java.lang.String> attrToMethodList = filter(docContent);
    return attrToMethodList;
}