public java.lang.Boolean backDirectory() {
    if ((finished) || (topDir.path.equals(mainDir.path))) {
        return true;
    }
    return false;
}