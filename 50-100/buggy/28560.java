private android.content.ContentValues speciesToContentValues(de.jordsand.birdcensus.core.Species species) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(BirdCountContract.Species.COLUMN_NAME_NAME, species.getName());
    if (species.hasScientificName()) {
        values.put(BirdCountContract.Species.COLUMN_NAME_SCIENTIFIC_NAME, species.getScientificName());
    }
    return values;
}