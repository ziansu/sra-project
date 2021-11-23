@java.lang.Override
public boolean accept(java.io.File file) {
    if (file.isDirectory()) {
        return true;
    }
    return false;
}