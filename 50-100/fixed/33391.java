@java.lang.Override
public boolean accept(java.io.File file) {
    if ((file.isDirectory()) || ((file.exists()) && (file.getName().toLowerCase().endsWith(".csv")))) {
        return true;
    }
    return false;
}