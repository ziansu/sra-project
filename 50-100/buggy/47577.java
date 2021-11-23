protected boolean rename(java.lang.String name) {
    if ((name.contains("/")) || (name.contains("\\"))) {
        return false;
    }
    file.renameTo(new java.io.File(((file.getParent()) + name)));
    return true;
}