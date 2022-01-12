public java.lang.String toString() {
    if ((status) == null)
        return getName();
    
    if (status.isEmpty())
        return getName();
    else
        return ((getName()) + " ") + (status);
    
}