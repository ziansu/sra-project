public boolean isFile() {
    if ((getScheme()) == null) {
        return false;
    }
    return (getScheme().compareToIgnoreCase(xtremweb.communications.Connection.fileScheme())) == 0;
}