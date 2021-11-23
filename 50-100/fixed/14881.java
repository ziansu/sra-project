private static void threadPool(int totalThread) {
    if ((org.apache.hadoop.hdfs.server.namenode.dummy.INodeServer.threadPool) == null)
        synchronized(org.apache.hadoop.hdfs.server.namenode.dummy.INodeServer.lock) {
            if ((org.apache.hadoop.hdfs.server.namenode.dummy.INodeServer.threadPool) == null)
                org.apache.hadoop.hdfs.server.namenode.dummy.INodeServer.threadPool = new java.util.concurrent.ThreadPoolExecutor(1, totalThread, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.ArrayBlockingQueue<java.lang.Runnable>(5000), new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy());
            
        }
    
}