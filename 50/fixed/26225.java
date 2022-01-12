public void addWaypoints() {
    this.mapView.getPositions().addAll(this.mission.getPositions());
    this.mapView.updateView();
    updateView();
}