public java.lang.String compute() {
    if (!(aClass.isValid()))
        return null;
    
    return aClass.getQualifiedName();
}