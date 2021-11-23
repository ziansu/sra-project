@java.lang.Override
public cl.smartcities.isci.transportinspector.mapElements.drawer.MapDrawer changeToOnBus(cl.smartcities.isci.transportinspector.utils.Bus bus) {
    return new cl.smartcities.isci.transportinspector.mapElements.drawer.OnBusMapDrawer(this.mapView, this.fragment, this.slidingPanelController, this.getCurrentGeoPoint(), bus);
}