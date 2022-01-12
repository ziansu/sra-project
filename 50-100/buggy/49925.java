@org.junit.Test
public void testLoad() {
    final org.apache.calcite.tools.PigRelBuilder builder = org.apache.calcite.tools.PigRelBuilder.create(org.apache.calcite.test.PigRelBuilderTest.config().build());
    final org.apache.calcite.rel.RelNode root = builder.load("EMP.csv", null, null).build();
    org.junit.Assert.assertThat(org.apache.calcite.plan.RelOptUtil.toString(root), org.hamcrest.CoreMatchers.is("LogicalTableScan(table=[[scott, EMP]])\n"));
}