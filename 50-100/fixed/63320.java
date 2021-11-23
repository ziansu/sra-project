private boolean isNegative(java.lang.String raw) {
    boolean retval = false;
    raw = raw.toUpperCase();
    if ((raw.contains("N")) || (raw.contains("E")))
        retval = false;
    else
        if ((raw.contains("S")) || (raw.contains("W")))
            retval = true;
        
    
    return retval;
}