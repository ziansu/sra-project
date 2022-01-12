@java.lang.Override
protected void onPostExecute(com.wozainali.manho.myapplication.kml.Placemark placemark) {
    if (placemark != null) {
        com.squareup.otto.Bus bus = com.wozainali.manho.myapplication.bus.ZaiNaliBus.getBus();
        bus.post(new com.wozainali.manho.myapplication.bus.events.ZoomToPointEvent(placemark));
        bus.post(new com.wozainali.manho.myapplication.bus.events.AddMarkerEvent(placemark));
        bus.post(new com.wozainali.manho.myapplication.bus.events.DrawPolygonsEvent(placemark.getPolygons()));
    }
}