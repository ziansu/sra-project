private static java.lang.Throwable getCause(java.lang.Throwable thrown, java.lang.Class cause) {
    if (cause.isInstance(thrown))
        return thrown;
    
    java.lang.Throwable child = thrown.getCause();
    do {
        if (cause.isInstance(child))
            return child;
        
        child = child.getCause();
    } while (child != null );
    return null;
}