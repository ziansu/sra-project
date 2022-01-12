void jRepartition() {
    io.vntr.repartition.NoRepResults noRepResults = io.vntr.repartition.JRepartitioner.repartition(alpha, initialT, deltaT, jaK, io.vntr.middleware.HejarMiddleware.numRestarts, getManager().getPartitionToUsers(), getManager().getFriendships(), io.vntr.middleware.HejarMiddleware.incremental);
    getManager().increaseTallyLogical(noRepResults.getLogicalMoves());
    if ((noRepResults.getUidsToPids()) != null) {
        physicallyMigrate(noRepResults.getUidsToPids());
    }
}