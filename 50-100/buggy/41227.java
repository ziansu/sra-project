public java.lang.String getDstPath() {
    if ((dst) == null)
        return null;
    
    if ((parent) != null)
        return ((parent.getDstPath()) + (getParentPathSep())) + (dst);
    
    return dst;
}