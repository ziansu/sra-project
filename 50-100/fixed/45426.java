public void setCoverArt(java.lang.String coverArtUrl) {
    if (coverArtUrl != (this.coverArtUrl)) {
        if (!(coverArtUrl.startsWith("http"))) {
            return ;
        }
        try {
            java.net.URL url = new java.net.URL(coverArtUrl);
            java.net.URLConnection connection = url.openConnection();
            coverArt = org.apache.commons.io.IOUtils.toByteArray(connection.getInputStream());
        } catch (java.io.IOException ioe) {
            coverArt = null;
        }
        this.coverArtDirty = true;
    }else {
        this.coverArtDirty = false;
    }
}