private void configureVoltageProvider() {
    ui.controllers.VariableProvider<ui.controllers.Voltage> provider = kernel.getVariableProvidersView().getVoltageProvider();
    try {
        provider.setPollingInterval(ui.controllers.ResultController.voltagePollingInterval);
    } catch (exceptions.NonNegativeDurationException error) {
        error.printStackTrace();
    }
    provider.addOnChangeListener(new ui.controllers.ResultController.VoltageChangeHandler(reportedVoltage, voltageSeries));
    configureVoltageSeries();
}