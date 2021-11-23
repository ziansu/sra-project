@java.lang.Override
public void run() {
    if (dl.needToDownload()) {
        synchronized(pool) {
            pool.add(dl);
        }
    }
}