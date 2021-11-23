public xtremweb.common.UID getUID() {
    try {
        final java.lang.String uidStr = getPath().substring(1, getPath().length());
        return new xtremweb.common.UID(uidStr);
    } catch (final java.lang.Exception e) {
    }
    return null;
}