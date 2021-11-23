@java.lang.Override
public boolean accept(java.io.File f) {
    return (f.getName().startsWith(name)) && (f.getName().endsWith(".jar"));
}