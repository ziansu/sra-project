@java.lang.Override
public void setCoordinates(dev.eyesless.simple_weather_for_fishermans.geocoding_responce_classes.Location location) {
    if ((location.getLastlocation()) != null) {
        setAutocompleted(location.getLastlocation());
        cfinterface.setDefoultLoc();
        cfinterface.setLocUnavaliable();
    }else {
        cfinterface.setCoords((((java.lang.String.valueOf(location.getLat())) + " and ") + (java.lang.String.valueOf(location.getLng()))));
    }
}