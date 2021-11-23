@java.lang.Override
public boolean isSegment() {
    insureStreamOpened();
    if ((this.contentType) != null) {
        if (this.contentType.toLowerCase().equals("text/segments-manifest")) {
            return true;
        }
    }
    if (this.url.toLowerCase().endsWith("segments")) {
        return true;
    }
    return false;
}