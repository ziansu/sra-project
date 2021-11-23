public static mondrian.rolap.CellRequest makeRequest(final mondrian.rolap.Member[] members) {
    return mondrian.rolap.RolapAggregationManager.makeCellRequest(members, false, false, null, null);
}