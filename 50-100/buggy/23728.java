private java.lang.String replaceHeadimgSize(int size) {
    if ((headimgurl) == null) {
        return null;
    }
    int pos = headimgurl.lastIndexOf('/');
    if (pos == (-1)) {
        return null;
    }
    return (headimgurl.substring(0, pos)) + size;
}