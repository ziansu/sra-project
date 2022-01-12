public ru.furry.furview2.images.FurImageBuilder makeFromRemoteFurImage(ru.furry.furview2.images.RemoteFurImage remoteImage) {
    this.searchQuery = remoteImage.getSearchQuery();
    this.description = remoteImage.getDescription();
    this.rating = remoteImage.getRating();
    this.fileUrl = remoteImage.getFileUrl();
    this.fileExt = remoteImage.getFileExt();
    this.pageUrl = remoteImage.getPageUrl();
    this.previewUrl = remoteImage.getPreviewUrl();
    this.filePath = remoteImage.getFileUrl();
    return this;
}