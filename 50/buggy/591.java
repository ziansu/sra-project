@java.lang.Override
public boolean supportFile(java.io.File f) {
    return (f.isFile()) && (supportFile(f.getName()));
}