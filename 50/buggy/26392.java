private boolean isFirstRootLighter(int firstRootId, int secondRootId) {
    return (parentIds[firstRootId]) > (parentIds[secondRootId]);
}