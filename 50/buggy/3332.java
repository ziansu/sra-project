protected boolean isObjectLoadable() {
    byte[] content = cacheData.getContent();
    return (content != null) && ((content.length) > 0);
}