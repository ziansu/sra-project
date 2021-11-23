public boolean hasExport(java.lang.String name) {
    for (java.lang.String n : exports)
        if ((n != null) && (n.equals(name)))
            return true;
        
    
    return false;
}