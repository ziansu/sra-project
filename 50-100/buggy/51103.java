void registerMSU(java.util.Set<org.deidentifier.arx.risk.msu.SUDA2Item> set) {
    (this.numMSUs)++;
    (this.sizeDistribution[set.size()])++;
    for (org.deidentifier.arx.risk.msu.SUDA2Item item : set) {
        (this.columnContributions[item.getColumn()])++;
    }
}