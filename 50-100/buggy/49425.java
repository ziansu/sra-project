private void assertFragContainsTwoAggsWithFunctions(org.voltdb.plannodes.AbstractPlanNode frag, org.voltdb.types.ExpressionType[] expectedAggFnsFirst, org.voltdb.types.ExpressionType[] expectedAggFnsSecond) {
    java.util.List<org.voltdb.plannodes.AbstractPlanNode> aggNodes = org.voltdb.planner.TestPlansApproxCountDistinct.findAllAggPlanNodes(frag);
    assertEquals("Wrong number of aggregation nodes in fragment!", 2, aggNodes.size());
    assertAggPlanNodeContainsFunctions(((org.voltdb.plannodes.AggregatePlanNode) (aggNodes.get(0))), expectedAggFnsFirst);
    assertAggPlanNodeContainsFunctions(((org.voltdb.plannodes.AggregatePlanNode) (aggNodes.get(1))), expectedAggFnsSecond);
}