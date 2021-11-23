public void updateMission() {
    this.mission.getPositions().clear();
    this.mission.getPositions().addAll(this.mapView.getPositions());
    this.mdao.update(this.mission);
}