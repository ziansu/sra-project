public void setQueue(@android.support.annotation.NonNull
java.util.List<com.marverenic.music.instances.Song> queue, int index) {
    mQueue = queue;
    if (mShuffle) {
        shuffleQueue();
    }
    setBackingQueue(index);
}