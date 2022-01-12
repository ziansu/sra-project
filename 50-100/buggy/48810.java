@org.springframework.scheduling.annotation.Scheduled(fixedDelay = 50, initialDelay = 200)
public void handleOutgoing() {
    if (!(application.isInitialized())) {
        return ;
    }
    pl.edu.uj.jnode.cluster.message.PrimaryHeartBeat heartBeat = pl.edu.uj.jnode.cluster.message.PrimaryHeartBeat.create(workerPool.poolSize(), workerPool.jobsInPool());
    if ((!(forceHeartBeat.getAndSet(false))) && (last.equals(heartBeat))) {
        return ;
    }
    messageGateway.send(heartBeat);
    last = heartBeat;
}