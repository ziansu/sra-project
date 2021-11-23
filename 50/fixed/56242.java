@java.lang.Override
public boolean accept(java.net.URL x) {
    java.lang.String fn = x.getFile();
    return fileFilter.accept(new java.io.File(fn));
}