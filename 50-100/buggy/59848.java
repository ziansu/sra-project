public boolean updateInvalidLocationTest() {
    boolean failure;
    failure = conn.updateTagInDatabase(upc1, firstSerials[0], new edu.auburn.eng.sks0024.rfid_connector_test.ReaderLocation(locations[0], locations[1]), c);
    failure &= conn.updateTagInDatabase(upc2, firstSerials[1], new edu.auburn.eng.sks0024.rfid_connector_test.ReaderLocation(locations[1], locations[2]), c);
    return (!failure) && (getUpdatedLocationsTest());
}