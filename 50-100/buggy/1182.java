@java.lang.Override
public synchronized boolean readyToDecide() {
    int totalTMCount = ch.epfl.tkvs.yarn.appmaster.AppMaster.numberOfRegisteredTMs();
    ch.epfl.tkvs.yarn.appmaster.AppMaster.log2.info(((((("graph_size = " + (ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.graphs.size())) + " - total_expected=") + totalTMCount) + " - is_second_graph_empty=") + (ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.secondGraphs.isEmpty())), ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.class);
    if ((ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.graphs.size()) == totalTMCount)
        return true;
    
    if (!(ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.secondGraphs.isEmpty()))
        return true;
    
    return false;
}