public boolean isSymbolicLink(java.io.File parent, java.lang.String name) throws java.io.IOException {
    if (org.codehaus.plexus.util.Java7Detector.isJava7()) {
        return org.codehaus.plexus.util.NioFiles.isSymbolicLink(parent);
    }
    java.io.File resolvedParent = new java.io.File(parent.getCanonicalPath());
    java.io.File toTest = new java.io.File(resolvedParent, name);
    return !(toTest.getAbsolutePath().equals(toTest.getCanonicalPath()));
}