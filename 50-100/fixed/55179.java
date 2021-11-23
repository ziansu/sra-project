public boolean newVideo(java.lang.String id) {
    if (forceNewVideo) {
        forceNewVideo = false;
        return true;
    }
    if (!(oldVideoIds.contains(id))) {
        oldVideoIds.remove(((oldVideoIds.size()) - 1));
        oldVideoIds.add(0, id);
        return true;
    }
    return false;
}