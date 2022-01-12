public void exception(java.lang.Throwable ex, java.util.Map<java.lang.String, java.lang.Object> extraInfo) {
    int depth = 1;
    submitexception(ex, extraInfo, depth);
    while (depth <= 5) {
        depth++;
        java.lang.Throwable inner = ex.getCause();
        if (inner == null)
            return ;
        
        submitexception(inner, extraInfo, depth);
        ex = inner;
    } 
}