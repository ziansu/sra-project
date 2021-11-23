public void setContent(java.lang.String content) {
    synchronized(this) {
        this.content = content;
        getTextInfo();
    }
}