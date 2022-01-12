@java.lang.Override
public boolean isSegment() {
    insureStreamOpened();
    if ((this.contentType) != null) {
        if (this.contentType.toLowerCase().equals("text/segments-manifest")) {
            return true;
        }else
            if (this.url.toLowerCase().endsWith("segments")) {
                return true;
            }
        
        return false;
    }
    return false;
}