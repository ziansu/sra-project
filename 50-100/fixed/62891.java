public boolean setCaption(int index, java.lang.String caption) {
    this.captions.set(index, caption);
    if ((com.creedon.cordova.plugin.photobrowser.data.PhotoData.photoDataListener) != null) {
        return com.creedon.cordova.plugin.photobrowser.data.PhotoData.photoDataListener.onCaptionChanged(data.get(index), caption, id, type);
    }
    return false;
}