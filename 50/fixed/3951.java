public static java.lang.String encodeClassName(java.lang.String iClassName) {
    if (iClassName == null)
        return null;
    
    if (java.lang.Character.isDigit(iClassName.charAt(0)))
        iClassName = "-" + iClassName;
    
    return iClassName.replace(' ', '-');
}