public java.lang.String getMessage() {
    if ((traceback) != null)
        return traceback;
    
    java.lang.String m = super.getMessage();
    if (m == null)
        return null;
    
    if ((fileline) != null)
        return (fileline) + m;
    
    return m;
}