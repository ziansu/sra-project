@org.junit.Test
public void testScan() {
    final org.apache.calcite.tools.PigRelBuilder builder = org.apache.calcite.tools.PigRelBuilder.create(org.apache.calcite.test.PigRelBuilderTest.config().build());
    final org.apache.calcite.rel.RelNode root = builder.scan("EMP").build();
    org.junit.Assert.assertThat(org.apache.calcite.plan.RelOptUtil.toString(root), org.hamcrest.CoreMatchers.is("LogicalTableScan(table=[[scott, EMP]])\n"));
}