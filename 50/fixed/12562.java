public jsettlers.common.position.ShortPoint2D getNearestRiverPointInDefaultPartitionFor(jsettlers.common.position.ShortPoint2D referencePoint, int searchDistance) {
    return getNearestPointInDefaultPartitionOutOfSortedMap(referencePoint, sortedRiversInDefaultPartition, ((byte) (-1)), searchDistance, null);
}