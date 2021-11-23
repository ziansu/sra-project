public void destory() {
    this.destory = false;
    synchronized(taskQueue) {
        for (xyz.yidea.ThreadPool.ChildThread t : pools) {
            t.close();
            t.interrupt();
        }
    }
}