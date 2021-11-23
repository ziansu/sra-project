public void setDevPanStatusPowerConnection(boolean powerOn) {
    if (powerOn == (devPanStatusPowerOn)) {
        return ;
    }
    devPanStatusPowerOn = powerOn;
    sensorConnectionStatus.setText((devPanStatusPowerOn ? R.string.sensor_connection_on : R.string.sensor_connection_off));
    if ((currentFragment) == (ru.neurotech.hrvstress.views.MainView.PAGE_INDEX.MULTIPLE.ordinal())) {
        setPage(ru.neurotech.hrvstress.views.MainView.PAGE_INDEX.DEVICE_STATUS);
    }
}