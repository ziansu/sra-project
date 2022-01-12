@java.lang.Override
public java.lang.Long save(de.jordsand.birdcensus.core.BirdCount instance) {
    de.jordsand.birdcensus.database.repositories.SQLiteBirdCountRepository.BirdCountToSQLiteConverter converter = new de.jordsand.birdcensus.database.repositories.SQLiteBirdCountRepository.BirdCountToSQLiteConverter();
    long id = db.insert(BirdCountContract.BirdCount.TABLE_NAME, null, converter.extractBirdCountTableData(instance));
    for (android.content.ContentValues values : converter.extractObservationTableData(instance)) {
        db.insert(BirdCountContract.ObservedSpecies.TABLE_NAME, null, values);
    }
    return id;
}