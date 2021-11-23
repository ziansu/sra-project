private java.lang.String getNamespace() {
    java.lang.String namespace = "";
    for (java.lang.String name : mNameSpaces) {
        if (namespace.equals(""))
            namespace = namespace + ".";
        
        namespace = namespace + name;
    }
    return namespace;
}