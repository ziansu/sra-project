public void setStatus(bwapi.Position position, SCBot.RegionGraph.RegionStatus status) {
    this.nodes.get(SCBot.RegionGraph.generateId(bwta.BWTA.getRegion(position))).status = status;
}