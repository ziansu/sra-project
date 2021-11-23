@org.greenrobot.eventbus.Subscribe
public void onEventMainThread(com.fuelbuddy.mobile.base.Event event) {
    if (event instanceof com.fuelbuddy.mobile.map.event.OnPriceClickEvent) {
        if ((((com.fuelbuddy.mobile.map.event.OnPriceClickEvent) (event)).getGasStationModel()) != null) {
            com.fuelbuddy.mobile.model.GasStationModel gasStationModel = ((com.fuelbuddy.mobile.map.event.OnPriceClickEvent) (event)).getGasStationModel();
            mapController.centerOnPosition(true, com.fuelbuddy.mobile.util.MapUtil.getLatLng(gasStationModel.getGasStationLatitude(), gasStationModel.getGasStationLongitude()));
            mCallbacks.onInfoShow(gasStationModel);
        }
    }
}