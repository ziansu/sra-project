public void destory() {
    this.destory = true;
    synchronized(taskQueue) {
        for (xyz.yidea.ThreadPool.ChildThread t : pools) {
            t.close();
            t.interrupt();
        }
    }
}