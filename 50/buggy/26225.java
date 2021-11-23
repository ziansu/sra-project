public void addWaypoints() {
    this.mapView.getPositions().addAll(mission.getPositions());
    this.mapView.updateView();
    synchronized(this.mapView.getLock()) {
        updateView();
    }
}