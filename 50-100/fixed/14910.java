public java.lang.String getVideoCachePath() {
    if ((mVideoCachePath) == null) {
        mVideoCachePath = new java.lang.StringBuffer().append(ROOT_PATH).append("video_cache/").toString();
        java.io.File file = new java.io.File(mVideoCachePath);
        if ((!(file.exists())) && (file.mkdirs()))
            return mVideoCachePath;
        else
            return mVideoCachePath = ROOT_PATH;
        
    }
    return mVideoCachePath;
}