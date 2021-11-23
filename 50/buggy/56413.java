@java.lang.Override
public boolean accept(java.io.File pathname) {
    if (fileFilter.accept(pathname)) {
        return !(lookup.lookupDatabase(pathname));
    }
    return false;
}