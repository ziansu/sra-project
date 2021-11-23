public org.apache.calcite.rel.RelNode run(org.apache.calcite.plan.RelOptPlanner planner, org.apache.calcite.rel.RelNode rel, org.apache.calcite.plan.RelTraitSet requiredOutputTraits) {
    final org.apache.calcite.config.CalciteConnectionConfig config = planner.getContext().unwrap(org.apache.calcite.config.CalciteConnectionConfig.class);
    if ((config != null) && (config.forceDecorrelate())) {
        java.lang.System.out.println(("Before decorrelate:\n" + (org.apache.calcite.plan.RelOptUtil.toString(rel))));
        return org.apache.calcite.sql2rel.RelDecorrelator.decorrelateQuery(rel);
    }
    return rel;
}