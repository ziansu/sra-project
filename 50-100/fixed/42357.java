private void populateFields() {
    int nrOfDecoders = (((getByteRepresentation()[0]) & 255) - 4) / 13;
    for (int idx = 0; idx < nrOfDecoders; idx++) {
        data.add(analyse((4 + (idx * 13))));
    }
}