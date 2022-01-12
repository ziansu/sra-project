public boolean removeURL(final java.net.URL url) {
    boolean returnValue = false;
    if ((url != null) && (!(this.urls.isEmpty()))) {
        returnValue = this.urls.remove(url);
    }
    return returnValue;
}