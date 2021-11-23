private double carbonInBiomassEstiamte(double biomass) {
    return (0.475 * (greenTonToBoneDryTon(biomass, 0.62))) / (edu.mtu.utilities.Constants.MetricTonToGigaTon);
}