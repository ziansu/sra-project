@org.junit.Test
public void testDistinct() {
    final org.apache.calcite.tools.PigRelBuilder builder = org.apache.calcite.tools.PigRelBuilder.create(org.apache.calcite.test.PigRelBuilderTest.config().build());
    final org.apache.calcite.rel.RelNode root = builder.scan("EMP").distinct().build();
    final java.lang.String plan = "LogicalAggregate(group=[{0, 1, 2, 3, 4, 5, 6, 7}])\n" + "  LogicalTableScan(table=[[scott, EMP]])\n";
    org.junit.Assert.assertThat(str(root), org.hamcrest.CoreMatchers.is(plan));
}