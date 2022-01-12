public int getPhysicalUpperLimitProcessNum(xin.bluesky.leiothrix.server.bean.node.NodeInfo worker) {
    xin.bluesky.leiothrix.server.bean.node.NodePhysicalInfo physicalInfo = worker.getPhysicalInfo();
    int freeMemory = ((int) ((physicalInfo.getMemoryFreeBeforeAsWorker()) >> 10));
    int upperProcessorNumber = (freeMemory / (xin.bluesky.leiothrix.server.action.WorkerProcessorInvoker.WORKER_PROCESSOR_MEMORY)) + (xin.bluesky.leiothrix.server.action.WorkerProcessorInvoker.WORKER_MEMORY_REDUNDANCY);
    return upperProcessorNumber;
}