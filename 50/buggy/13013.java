@java.lang.Override
protected java.io.InputStream createData() throws java.io.IOException {
    if ((item) instanceof com.psddev.dari.util.AbstractStorageItem) {
        return ((com.psddev.dari.util.AbstractStorageItem) (item)).createData();
    }
    return null;
}