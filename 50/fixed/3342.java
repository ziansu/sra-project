@java.lang.Override
public boolean accept(java.io.File dir, java.lang.String name) {
    if (name.endsWith(".jpg")) {
        return true;
    }
    return false;
}