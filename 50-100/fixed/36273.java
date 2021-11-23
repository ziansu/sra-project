public void setAll(be.dimi.iracing.scheduler.race.RaceModel raceModel) {
    if (raceModelTableView.getSelectionModel().getSelectedItem().equals(raceModel)) {
        setTimeUntilRace(raceModel.getDate());
        setLaps(java.lang.String.valueOf(raceModel.getLaps()));
        if (raceModel.isAlarmSet()) {
            setAlarmSet("Yes");
        }else {
            setAlarmSet("No");
        }
        setTrack(raceModel.getTrack());
        setRoadType(raceModel.getTrackType().toString());
    }
}