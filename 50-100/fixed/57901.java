public java.io.FileOutputStream downloadFile(java.lang.String remoteSrcPath, java.lang.String localDestPath) throws omnidrive.OmniBase.OmniException {
    java.io.FileOutputStream outputStream = null;
    try {
        outputStream = new java.io.FileOutputStream(localDestPath);
        this.client.getFile(remoteSrcPath, null, outputStream);
    } catch (java.io.IOException ex) {
        throw new omnidrive.Dropbox.DropboxException("Failed to download file.");
    } catch (omnidrive.Dropbox.DbxException ex) {
        throw new omnidrive.Dropbox.DropboxException("Failed to access remote path.");
    } finally {
        try {
            outputStream.close();
        } catch (java.io.IOException ex) {
            throw new omnidrive.Dropbox.DropboxException("Failed to close output stream.");
        }
    }
    return outputStream;
}