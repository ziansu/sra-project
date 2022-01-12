protected void publishReportableState() {
    if ((reportableState) == null) {
        reportableState = new org.flexiblepower.simulation.pvpanel.PVSimulation.ReportableState(demand);
    }else {
        reportableState.update(demand);
    }
}