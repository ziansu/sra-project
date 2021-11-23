static void forget(java.lang.String key) {
    com.dylanvann.fastimage.OkHttpProgressGlideModule.DispatchingProgressListener.LISTENERS.remove(key);
    com.dylanvann.fastimage.OkHttpProgressGlideModule.DispatchingProgressListener.PROGRESSES.remove(key);
}