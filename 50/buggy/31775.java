public void updateMission() {
    this.mission.getPositions().clear();
    this.mission.getPositions().addAll(mapView.getPositions());
    this.mdao.update(this.mission);
}