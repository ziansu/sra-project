@java.lang.Override
protected java.io.InputStream getStreamFromOtherSource(java.lang.String imageUri, java.lang.Object extra) throws java.io.IOException {
    try {
        java.io.InputStream stream = mAPI.getThumbnailStream(imageUri, DropboxAPI.ThumbSize.ICON_256x256, DropboxAPI.ThumbFormat.JPEG);
        return stream;
    } catch (com.dropbox.client2.exception.DropboxUnlinkedException e) {
        throw new java.io.IOException(e);
    } catch (com.dropbox.client2.exception.DropboxException e) {
        throw new java.io.IOException(e);
    }
}