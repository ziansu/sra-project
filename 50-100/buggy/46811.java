public static mondrian.rolap.DrillThroughCellRequest makeDrillThroughRequest(final mondrian.rolap.Member[] members, final boolean extendedContext, mondrian.rolap.RolapCube cube, java.util.List<mondrian.rolap.Exp> fieldsList) {
    assert cube != null;
    return ((mondrian.rolap.DrillThroughCellRequest) (mondrian.rolap.RolapAggregationManager.makeCellRequest(members, true, extendedContext, cube, fieldsList)));
}