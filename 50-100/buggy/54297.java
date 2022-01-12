@java.lang.Override
public void close() {
    synchronized(this) {
        if (this.closed)
            return ;
        else
            this.closed = true;
        
    }
    synchronized(packetsToReceive) {
        packetsToReceive.notifyAll();
    }
    synchronized(packetsToSend) {
        packetsToSend.notifyAll();
    }
    turnCandidateHarvest.harvester.getStunStack().removeIndicationListener(turnCandidateHarvest.hostCandidate.getTransportAddress(), this);
    turnCandidateHarvest.close(this);
}