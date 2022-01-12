public void writeRecogLat(xmlParser.Ships shipList, java.lang.String filename, boolean imperial) {
    writeLatex((((((preamble(imperial)) + (startTable(imperial))) + (allShips(shipList, imperial))) + (endTable())) + (terminate())), filename, false);
}