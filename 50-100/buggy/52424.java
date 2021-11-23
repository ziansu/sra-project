public void stop() {
    disconnect();
    if ((worker) != null) {
        worker.interrupt();
        try {
            worker.join();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
            worker.interrupt();
        }
        frameCache.clear();
        worker = null;
    }
    needToFindKeyFrame = true;
    android.util.Log.i(net.ossrs.yasea.SrsFlvMuxer.TAG, java.lang.String.format("SrsFlvMuxer closed"));
}