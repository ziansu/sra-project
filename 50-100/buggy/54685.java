void repartition() {
    io.vntr.repartition.NoRepResults noRepResults = io.vntr.repartition.JRepartitioner.repartition(alpha, initialT, deltaT, k, numRestarts, getManager().getPartitionToUsers(), getManager().getFriendships(), incremental, false);
    getManager().increaseTallyLogical(noRepResults.getLogicalMoves());
    if ((noRepResults.getUidsToPids()) != null) {
        physicallyMigrate(noRepResults.getUidsToPids());
    }
}