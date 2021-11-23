public void addIntermediateStation(java.lang.String trainName, java.lang.String station) {
    if (trainName == null)
        throw new java.lang.NullPointerException("Train name cannot be null");
    
    if (station == null)
        throw new java.lang.NullPointerException("Station name cannot be null");
    
    for (TrainSchedule.Train e : trainStorage) {
        if (e.getName().equals(trainName)) {
            e.addIntermediateStation(station);
            return ;
        }
    }
}