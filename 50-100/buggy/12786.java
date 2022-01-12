private static int getResIdByStatus(com.ogp.hotspotincar.WatchdogService.ActuatorState actuatorState) {
    if ((com.ogp.hotspotincar.WatchdogService.ActuatorState.UNCHANGED) == actuatorState) {
        actuatorState = com.ogp.hotspotincar.HotspotWidget.storedState;
    }else {
        com.ogp.hotspotincar.HotspotWidget.storedState = actuatorState;
    }
    switch (actuatorState) {
        case NOT_ACTUATED :
            return R.drawable.disconnected;
        case ACTUATED :
            return R.drawable.connected;
        default :
            return R.drawable.disabled;
    }
}