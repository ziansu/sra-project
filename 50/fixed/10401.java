public void run() {
    setPriority(java.lang.Thread.MAX_PRIORITY);
    synchronized(com.utyf.pmetro.map.TRP.rt) {
        com.utyf.pmetro.map.TRP.rt.createGraph();
        com.utyf.pmetro.map.TRP.setStart(com.utyf.pmetro.map.TRP.routeStart);
        com.utyf.pmetro.map.TRP.setEnd(com.utyf.pmetro.map.TRP.routeEnd);
    }
    progDialog.dismiss();
    MapActivity.mapActivity.mapView.redraw();
}