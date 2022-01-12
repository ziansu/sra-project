public boolean cancelLoadingThumbnail() {
    if ((((thumbnail) == null) || ((thumbnail.get()) == null)) || ((thumbnail.get().getProgress()) == 1)) {
        return false;
    }
    thumbnail.get().cancel();
    return true;
}