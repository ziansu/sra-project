public org.apache.calcite.rel.RelNode convert(org.apache.calcite.rel.RelNode rel) {
    final org.apache.calcite.rel.logical.LogicalProject project = ((org.apache.calcite.rel.logical.LogicalProject) (rel));
    final org.apache.phoenix.calcite.RelTraitSet traitSet = project.getTraitSet().replace(out);
    return new org.apache.phoenix.calcite.PhoenixProject(project.getCluster(), traitSet, convert(project.getInput(), project.getInput().getTraitSet().replace(out)), project.getProjects(), project.getRowType());
}