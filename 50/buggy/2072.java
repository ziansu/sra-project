public void stopSong() {
    synchronized(lockObj) {
        try {
            clip.stop();
            lockObj.wait();
        } catch (java.lang.Exception e) {
        }
    }
}