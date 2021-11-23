protected static java.lang.String getClassName(java.lang.String fullyQualifiedName) {
    int index = fullyQualifiedName.lastIndexOf(".");
    if (index > 0) {
        return fullyQualifiedName.substring((index + 1));
    }else
        return fullyQualifiedName;
    
}