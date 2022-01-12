public void gotoPrevious() throws java.io.IOException {
    this.previous = getLink(this.payload, "previous");
    this.payload = extract(getURL(this.previous));
}