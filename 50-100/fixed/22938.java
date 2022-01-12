public org.apache.calcite.rel.RelNode convert(org.apache.calcite.rel.RelNode rel) {
    final org.apache.calcite.rel.core.Sort sort = ((org.apache.calcite.rel.core.Sort) (rel));
    final org.apache.phoenix.calcite.RelTraitSet traitSet = sort.getTraitSet().replace(out).replace(sort.getCollation());
    return new org.apache.phoenix.calcite.PhoenixSort(rel.getCluster(), traitSet, convert(sort.getInput(), sort.getInput().getTraitSet().replace(RelCollationImpl.EMPTY)), sort.getCollation(), sort.offset, sort.fetch);
}