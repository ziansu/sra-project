private android.location.Location getBusLocation() {
    return cl.smartcities.isci.transportinspector.positionProvider.PositionProvider.getInstance().getLastKnownLocation();
}