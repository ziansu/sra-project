@java.lang.Override
public void visitSymlink(java.io.File link, java.lang.String target, java.lang.String relativePath) throws java.io.IOException {
    try {
        mkdirsE(new java.io.File(dest, relativePath).getParentFile());
        writing(new java.io.File(dest, target));
        hudson.Util.createSymlink(dest, target, relativePath, TaskListener.NULL);
    } catch (java.lang.InterruptedException x) {
        throw new java.io.IOException(x);
    }
    count.incrementAndGet();
}