public java.util.ArrayList<bwta.Region> getRegionsWithStatus(SCBot.RegionGraph.RegionStatus status) {
    SCBot.RegionGraph.Node[] sorted = ((SCBot.RegionGraph.Node[]) (this.nodes.values().toArray()));
    java.util.Arrays.sort(sorted);
    java.util.ArrayList<bwta.Region> regions = new java.util.ArrayList<bwta.Region>(sorted.length);
    for (SCBot.RegionGraph.Node n : sorted) {
        if ((n.status) == status)
            regions.add(n.region);
        
    }
    return regions;
}