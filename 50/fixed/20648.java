public boolean hasNext() throws act.data.FileUploadException, java.io.IOException {
    return (!(eof)) && ((itemValid) || (findNextItem()));
}