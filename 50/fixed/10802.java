public void gotoPrevious(java.lang.String previous) throws java.io.IOException {
    this.payload = extract(getURL(previous));
}