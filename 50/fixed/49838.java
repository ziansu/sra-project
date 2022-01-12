protected void publishReportableState(double newDemand, double oldEnergyCost) {
    if ((reportableState) == null) {
        reportableState = new org.flexiblepower.simulation.battery.UtilityPowerSimulation.ReportableState(newDemand, energyCost, oldEnergyCost);
    }else {
        reportableState.update(newDemand, energyCost, oldEnergyCost);
    }
}