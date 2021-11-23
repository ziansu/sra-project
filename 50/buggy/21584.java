public void startSong() {
    synchronized(lockObj) {
        clip.start();
        lockObj.notify();
    }
}