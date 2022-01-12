public void run(boolean continue_from_checkpoint) {
    if (!continue_from_checkpoint) {
        DefaultDriverGenome genome = new DefaultDriverGenome();
        drivers[0] = genome;
        DefaultRace race = new DefaultRace();
        race.setTrack("aalborg", "road");
        race.laps = 1;
        results = race.runRace(drivers, true);
        cicontest.algorithm.abstracts.DriversUtils.storeGenome(drivers[0]);
    }
    cicontest.algorithm.abstracts.DriversUtils.createCheckpoint(this);
}