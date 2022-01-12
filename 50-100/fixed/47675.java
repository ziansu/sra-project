private void _connect(com.cronam.eedlecom.Logger l, com.cronam.eedlecom.RunnableMsgIn rmi, com.cronam.eedlecom.SocketCreator sc, java.lang.Runnable onError, com.cronam.eedlecom.executors.queueimpl.QueueImpl qq) {
    com.cronam.eedlecom.SocketHolder shared = new com.cronam.eedlecom.SocketHolder();
    java.util.concurrent.Semaphore csM = new java.util.concurrent.Semaphore(1, true);
    nr = new com.cronam.eedlecom.NetworkReader(l, sc, shared, csM, rmi, onError, qq);
    nw = new com.cronam.eedlecom.NetworkWriter(l, sc, shared, csM, onError, qq);
}