@java.lang.Override
public boolean accept(java.io.File f) {
    if (f.isDirectory()) {
        return false;
    }
    java.lang.String s = f.getName();
    return (s.endsWith(("." + (suffix)))) || (s.endsWith(("." + (suffix.toUpperCase()))));
}