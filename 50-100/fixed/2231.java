public java.util.Optional<com.jordan30001.twitch.api.video.Video> getVideo(java.lang.String id) {
    java.util.Optional<com.jordan30001.twitch.api.video.Video> cached = searchCache(id);
    if (cached.isPresent())
        return cached;
    
    java.util.Optional<com.jordan30001.twitch.api.video.Video> ret = java.util.Optional.ofNullable(newVideoInstance(id));
    return ret;
}