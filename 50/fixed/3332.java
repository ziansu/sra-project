protected boolean isObjectLoadable() {
    if ((cacheData) == null) {
        return false;
    }
    byte[] content = cacheData.getContent();
    return (content != null) && ((content.length) > 0);
}