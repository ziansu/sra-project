private void removePactorFromCollisionBucket(java.lang.String pactorName) {
    Engine.TileCoordinate tc = getPositionFor(pactorName);
    createCollisionBucketForTileCoordinateIfBucketAbsent(tc);
    sharedPactorLocationBuckets.get(tc).remove(pactorName);
}