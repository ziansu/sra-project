public boolean newVideo(java.lang.String id) {
    if (forceNewVideo) {
        forceNewVideo = false;
        return true;
    }
    if (!(oldVideoIds.contains(id))) {
        oldVideoIds.remove(0);
        oldVideoIds.add(id);
        return true;
    }
    return false;
}