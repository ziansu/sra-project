private void populateFields() {
    int nrOfDecoders = (((getByteRepresentation()[0]) & 255) - 4) / 13;
    java.lang.System.out.println(("Found " + nrOfDecoders));
    for (int idx = 0; idx < nrOfDecoders; idx++) {
        analyse((4 + (idx * 13)));
    }
}