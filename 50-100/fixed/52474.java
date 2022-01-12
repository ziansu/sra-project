@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    if (!(observable instanceof skynamiccontrol.model.Aircraft)) {
        return ;
    }
    skynamiccontrol.model.Aircraft aircraft = ((skynamiccontrol.model.Aircraft) (observable));
    javafx.application.Platform.runLater(() -> {
        for (skynamiccontrol.map.AircraftZoomLayer aircraftZoomLayer : aircraftZoomLayers) {
            aircraftZoomLayer.setAircraftPosition(new skynamiccontrol.map.GPSCoordinate(aircraft.getLatitude(), aircraft.getLongitude()), aircraft.getHeading());
        }
    });
}