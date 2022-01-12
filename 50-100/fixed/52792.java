void registerMSU(org.deidentifier.arx.risk.msu.SUDA2Item item, org.deidentifier.arx.risk.msu.SUDA2ItemSet set) {
    (this.numMSUs)++;
    (this.sizeDistribution[set.size()])++;
    int size = set.size();
    for (int i = 0; i < size; i++) {
        (this.columnContributions[set.get(i).getColumn()])++;
    }
    (this.columnContributions[item.getColumn()])++;
}