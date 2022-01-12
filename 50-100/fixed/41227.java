public java.lang.String getDstPath() {
    if (((dst) == null) || (((parent) != null) && ((parent.getDstPath()) == null)))
        return null;
    
    if ((parent) != null)
        return ((parent.getDstPath()) + (getParentPathSep())) + (dst);
    
    return dst;
}