private void configurePressureProvider() {
    ui.controllers.VariableProvider<ui.controllers.Pressure> provider = kernel.getVariableProvidersView().getPressureProvider();
    try {
        provider.setPollingInterval(ui.controllers.ResultController.pressurePollingInterval);
    } catch (exceptions.NonNegativeDurationException error) {
        error.printStackTrace();
    }
    provider.addOnChangeListener(new ui.controllers.ResultController.PressureChangeHandler(reportedPressure, pressureSeries));
}