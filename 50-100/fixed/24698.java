public void clearNamespaces() {
    java.lang.Object[] keySetArray = nameSpaces.keySet().toArray();
    for (java.lang.Object key : keySetArray) {
        if (isRequiredNamespaceBinding(java.net.URI.create(((java.lang.String) (key)))))
            continue;
        
        nameSpaces.remove(((java.lang.String) (key)));
    }
}