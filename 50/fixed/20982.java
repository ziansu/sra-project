@java.lang.Override
protected io.datakernel.eventloop.EventloopServer getWorkerServer() {
    currentAcceptor = ((currentAcceptor) + 1) % (workerServers.length);
    return workerServers[currentAcceptor];
}