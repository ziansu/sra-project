@java.lang.Override
public void onReadingStarted(java.util.concurrent.BlockingQueue<com.spartango.hicgraph.data.HiCRead> readQueue) {
    buildThread.start();
}