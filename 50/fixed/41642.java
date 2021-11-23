public xtremweb.common.UID getUID() {
    if ((getPath()) == null) {
        return null;
    }
    final java.lang.String uidStr = getPath().substring(1, getPath().length());
    return new xtremweb.common.UID(uidStr);
}