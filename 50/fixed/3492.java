@java.lang.Override
public boolean accept(java.io.File dir, java.lang.String name) {
    return name.toLowerCase().endsWith(fileExt);
}