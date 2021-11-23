public void addCarsToRace(int carID) {
    timber.log.Timber.e("Connecting Car %s to current Race %s", carID, RaceID);
    db.Config config = new db.Config(null, null, carID);
    long configID = daoFactory.getDao(DaoTypes.CONFIG).insert(config);
    timber.log.Timber.e("Created Config with ID: %s", configID);
    db.Lap lap = new db.Lap(null, null, 1, RaceID, configID);
    long lapID = daoFactory.getDao(DaoTypes.LAP).insert(lap);
    timber.log.Timber.e("Created Lap with ID: %s", lapID);
}