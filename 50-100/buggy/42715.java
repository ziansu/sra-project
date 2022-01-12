private void startWorker(int muxerId) {
    final java.lang.String methodName = "startWorker";
    ie.jgriffin.fifothreadmuxer.FifoThreadMuxer.LOGGER.info(methodName);
    ie.jgriffin.fifothreadmuxer.FifoThreadMuxer.LOGGER.info("muxerId: {}");
    java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> workerQueue = new java.util.concurrent.LinkedBlockingQueue<>();
    workerTaskQueues.put(muxerId, workerQueue);
    ie.jgriffin.fifothreadmuxer.MuxerWorker worker = new ie.jgriffin.fifothreadmuxer.MuxerWorker(muxerId, workerQueue);
    workers.set(muxerId, worker);
    executorService.submit(worker);
}