protected java.lang.Long doInBackground(java.net.URL... urls) {
    long totalSize = 0;
    int delay = 1;
    long time = (java.lang.System.nanoTime()) / 1000000000;
    long newTime = time + delay;
    boolean connected = true;
    publishProgress(0);
    while (connected) {
        time = (java.lang.System.nanoTime()) / 1000000000;
        if (time >= newTime) {
            newTime = time + delay;
            message("TICK", false);
            publishProgress(0);
        }
    } 
    return totalSize;
}