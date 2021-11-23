protected void finalize() throws java.lang.Throwable {
    if ((mClosures) != null) {
        mClosures.clear();
    }
    super.finalize();
}