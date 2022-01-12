public jsettlers.common.position.ShortPoint2D getNearestCuttableObjectPointForPlayer(jsettlers.common.position.ShortPoint2D point, jsettlers.common.mapobject.EMapObjectType cuttableObject, int searchDistance, byte playerId) {
    jsettlers.ai.highlevel.AiPositions sortedResourcePoints = sortedCuttableObjectsInDefaultPartition.get(cuttableObject);
    if (sortedResourcePoints == null) {
        return null;
    }
    return getNearestPointInDefaultPartitionOutOfSortedMap(point, sortedResourcePoints, playerId, searchDistance);
}