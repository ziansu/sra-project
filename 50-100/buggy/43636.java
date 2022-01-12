public void addCC(bwapi.Unit cc) {
    VCEs.add(new java.util.ArrayList<bwapi.Unit>());
    mineralNodes.add(((java.util.ArrayList<bwapi.Unit>) (bwta.BWTA.getNearestBaseLocation(cc.getTilePosition()).getMinerals())));
    workersMineral.add(new java.util.ArrayList<bwapi.Unit>(0));
    workersVespin.add(new java.util.ArrayList<bwapi.Unit>(0));
}