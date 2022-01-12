private static com.ensoftcorp.atlas.core.query.Q getIPCGCallGraph(com.ensoftcorp.atlas.core.query.Q eventFunctions, com.ensoftcorp.atlas.core.query.Q selectedAncestors) {
    com.ensoftcorp.atlas.core.query.Q callEdges = com.ensoftcorp.atlas.core.script.Common.universe().edges(XCSG.Call);
    selectedAncestors = callEdges.reverse(eventFunctions).intersection(selectedAncestors);
    com.ensoftcorp.atlas.core.query.Q ipcgFunctions = eventFunctions.union(selectedAncestors);
    com.ensoftcorp.atlas.core.query.Q ipcgCallGraph = ipcgFunctions.union(callEdges.between(ipcgFunctions, ipcgFunctions));
    return ipcgCallGraph;
}