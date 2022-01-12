private void setResponse(java.lang.Object response) {
    synchronized(lock) {
        if ((this.response) != null) {
            com.googlecode.flickrjandroid.UploadThread.LOG.warn("Upload response set multiple times", new java.lang.RuntimeException((("Upload response already set to <" + (this.response)) + ">, not resetting")));
        }
        this.response = response;
    }
}