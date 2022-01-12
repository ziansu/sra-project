public void cancelLoadingThumbnail() {
    if ((((thumbnail) == null) || ((thumbnail.get()) == null)) || ((thumbnail.get().getProgress()) == 1))
        return ;
    
    thumbnail.get().cancel();
}