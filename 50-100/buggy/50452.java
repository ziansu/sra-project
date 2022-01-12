@org.springframework.scheduling.annotation.Scheduled(fixedDelay = 50, initialDelay = 200)
public void handleOutgoing() {
    if (!(application.isInitialized()))
        return ;
    
    pl.edu.uj.cluster.messages.PrimaryHeartBeat heartBeat = pl.edu.uj.cluster.messages.PrimaryHeartBeat.create(workerPool.jobsInPool(), workerPool.poolSize());
    if (last.equals(heartBeat))
        return ;
    
    messageGateway.send(heartBeat);
    last = heartBeat;
}