private boolean isNegative(java.lang.String raw) {
    boolean retval = false;
    raw = raw.toUpperCase();
    if ((raw.contains("N")) || (raw.contains("W")))
        retval = false;
    else
        if ((raw.contains("S")) || (raw.contains("E")))
            retval = true;
        
    
    return retval;
}