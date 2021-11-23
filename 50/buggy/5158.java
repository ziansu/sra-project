public double totalBottles(final java.util.List<service.OpReportREST.MovementTables> array) {
    double btlTot = 0;
    for (service.OpReportREST.MovementTables mt : array) {
        btlTot += mt.getBottlingVolume();
    }
    return btlTot;
}