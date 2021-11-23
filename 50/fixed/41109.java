@java.lang.Override
public boolean resourceExists(java.lang.String name) {
    java.io.File f = getFile(name);
    return f != null;
}