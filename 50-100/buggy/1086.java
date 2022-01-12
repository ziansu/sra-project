@java.lang.Override
public void apply(java.util.List<com.kylinolap.metadata.realization.IRealization> realizations, com.kylinolap.query.relnode.OLAPContext olapContext) {
    if (olapContext.isWeekMatch.containsKey(realizations.get(0))) {
        com.kylinolap.cube.CubeInstance cube = ((com.kylinolap.cube.CubeInstance) (realizations.get(0)));
        com.kylinolap.query.routing.RoutingRules.AdjustForWeeklyMatchCubeRule.adjustOLAPContext(cube, olapContext);
    }
}