protected void publishReportableState(double newDemand, double oldEnergyCost) {
    reportableState = new org.flexiblepower.simulation.battery.UtilityPowerSimulation.ReportableState(newDemand, energyCost, oldEnergyCost);
}