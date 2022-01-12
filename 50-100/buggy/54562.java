public android.content.ContentValues createPlaceValues() {
    android.content.ContentValues testValues = new android.content.ContentValues();
    testValues.put(AvBContract.PlaceEntry.COLUMN_PLACE_ID, org.avaliabrasil.avaliabrasil.data.TestUtilities.GOOGLEPLACESID);
    testValues.put(AvBContract.PlaceEntry.COLUMN_ADRESS, "Rua João Neves");
    testValues.put(AvBContract.PlaceEntry.COLUMN_DATE_TIME, "20150225 14:45");
    testValues.put(AvBContract.PlaceEntry.COLUMN_STATUS, "up");
    testValues.put(AvBContract.PlaceEntry.COLUMN_PHONE, "51 4321-0293");
    testValues.put(AvBContract.PlaceEntry.COLUMN_OPEN_HOURS, "08:00 - 17:00");
    return testValues;
}