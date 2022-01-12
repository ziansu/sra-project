public static no.uis.ux.cipsi.net.monitoringbalancing.domain.Switch getClosestMonitoringSwitch(edu.uci.ics.jung.graph.Graph<no.uis.ux.cipsi.net.monitoringbalancing.domain.Node, no.uis.ux.cipsi.net.monitoringbalancing.domain.WeightedLink> topology, no.uis.ux.cipsi.net.monitoringbalancing.domain.TrafficFlow flow) {
    java.util.List<no.uis.ux.cipsi.net.monitoringbalancing.domain.Switch> onPathSwitches = flow.getOnPathMonitoringSwitches();
    no.uis.ux.cipsi.net.monitoringbalancing.domain.Switch candidateSw = null;
    if ((onPathSwitches != null) && ((onPathSwitches.size()) > 0)) {
        candidateSw = onPathSwitches.get(0);
    }
    return candidateSw;
}