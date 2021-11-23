public boolean hasNext() throws act.data.FileUploadException, java.io.IOException {
    if (eof) {
        return false;
    }
    if (itemValid) {
        return true;
    }
    return findNextItem();
}