public java.lang.String getFilename() {
    java.io.File f = new java.io.File(getPath());
    if (!(isFromSprectraHeritated))
        return f.getName();
    
    return ((f.getName()) + "-") + (java.lang.String.valueOf(1));
}