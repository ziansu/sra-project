public static boolean containsCause(java.lang.Throwable t, java.lang.Class<? extends java.lang.Throwable> c) {
    while (t != null) {
        t = t.getCause();
        if (t != null)
            if (c.isAssignableFrom(t.getClass()))
                return true;
            
        
    } 
    return false;
}