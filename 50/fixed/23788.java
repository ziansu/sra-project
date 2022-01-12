private void writeHarvestedBiomass() throws java.io.IOException {
    double biomass = edu.mtu.steppables.marketplace.AggregateHarvester.getInstance().getBiomass();
    appendToCsv(edu.mtu.wup.model.WupScorecard.biomassFile, biomass);
}