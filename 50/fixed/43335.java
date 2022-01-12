@java.lang.Override
public java.io.InputStream getInputStream(java.lang.String name) throws java.io.IOException {
    gotoEntry(name);
    if ((entry) == null) {
        return null;
    }else {
        entry = null;
        return jarInputStream;
    }
}