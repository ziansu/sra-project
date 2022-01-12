public org.apache.calcite.rel.RelNode convert(org.apache.calcite.rel.RelNode rel) {
    final org.apache.calcite.rel.logical.LogicalFilter filter = ((org.apache.calcite.rel.logical.LogicalFilter) (rel));
    final org.apache.phoenix.calcite.RelTraitSet traitSet = filter.getTraitSet().replace(out);
    return new org.apache.phoenix.calcite.PhoenixFilter(rel.getCluster(), traitSet, convert(filter.getInput(), filter.getInput().getTraitSet().replace(out)), filter.getCondition());
}