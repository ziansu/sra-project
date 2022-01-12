public void setDestination(java.lang.String destination) throws java.lang.Exception {
    if (destination == null) {
        throw new java.lang.IllegalArgumentException("Destination is null");
    }
    java.nio.file.Path testDest = java.nio.file.Paths.get(destination).toRealPath(java.nio.file.LinkOption.NOFOLLOW_LINKS);
    if (!(java.nio.file.Files.isDirectory(testDest, java.nio.file.LinkOption.NOFOLLOW_LINKS)))
        throw new java.io.IOException("Destination does not exist or is not a directory");
    
    this.destination = testDest.toRealPath(java.nio.file.LinkOption.NOFOLLOW_LINKS).toString();
}