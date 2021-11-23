@java.lang.Override
public void update(java.util.Observable observable, java.lang.Object o) {
    skynamiccontrol.model.Aircraft aircraft = ((skynamiccontrol.model.Aircraft) (observable));
    for (skynamiccontrol.map.AircraftZoomLayer aircraftZoomLayer : aircraftZoomLayers) {
        javafx.application.Platform.runLater(() -> {
            aircraftZoomLayer.setAircraftPosition(new skynamiccontrol.map.GPSCoordinate(aircraft.getLatitude(), aircraft.getLongitude()), aircraft.getHeading());
        });
    }
}