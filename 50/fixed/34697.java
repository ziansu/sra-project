@java.lang.Override
public rst.domotic.state.TemperatureStateType.TemperatureState getTemperatureState() throws org.openbase.jul.exception.NotAvailableException {
    try {
        return getData().getTemperatureState();
    } catch (org.openbase.jul.exception.CouldNotPerformException ex) {
        throw new org.openbase.jul.exception.NotAvailableException("Temperature", ex);
    }
}