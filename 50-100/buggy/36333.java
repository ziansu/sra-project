public boolean partDownloaded(int part, byte[] bytes) {
    this.lastPart = part;
    this.done = part == (this.totalParts);
    if (this.stopDownloading) {
        closeFile();
    }else {
        if (this.done) {
            this.stopDownloading = true;
        }
        saveFile(bytes, stopDownloading);
    }
    return !(stopDownloading);
}