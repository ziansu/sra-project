@java.lang.Override
public synchronized boolean readyToDecide() {
    int totalTMCount = ch.epfl.tkvs.yarn.appmaster.AppMaster.numberOfRegisteredTMs();
    ch.epfl.tkvs.yarn.appmaster.AppMaster.log2.info(((("graph_size = " + (ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.graphs.size())) + " - total_expected=") + totalTMCount), ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.class);
    if ((ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.graphs.size()) == totalTMCount)
        return true;
    
    return false;
}