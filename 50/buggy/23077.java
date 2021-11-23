@java.lang.Override
public org.apache.calcite.rel.RelNode copy(org.apache.calcite.plan.RelTraitSet traitSet, java.util.List<org.apache.calcite.rel.RelNode> inputs) {
    return new org.apache.drill.exec.planner.physical.ScanPrel(this.getConvention(), this.getCluster(), traitSet, groupScan, this.rowType, this.getTable());
}