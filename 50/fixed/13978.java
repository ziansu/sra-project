public boolean loadLibrary() {
    if (loadLibrary)
        return loadLibrary;
    
    try {
        java.lang.System.loadLibrary("scale");
        loadLibrary = true;
        return loadLibrary;
    } catch (java.lang.UnsatisfiedLinkError exception) {
        return false;
    }
}