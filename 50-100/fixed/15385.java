public java.lang.String verifyVM(java.io.File f) {
    if (!(f.isDirectory()))
        return "Not a directory";
    
    java.io.File bin = new java.io.File(f, "bin");
    if (!(bin.isDirectory()))
        return "No bin directory %s for a VM's executables";
    
    java.io.File lib = new java.io.File(f, "lib");
    if (!(lib.isDirectory()))
        return "No lib directory %s for a VM's libraries and certificates";
    
    return null;
}