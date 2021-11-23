private void assertFragContainsAggWithFunctions(org.voltdb.plannodes.AbstractPlanNode frag, org.voltdb.types.ExpressionType... expectedAggFns) {
    java.util.List<org.voltdb.plannodes.AbstractPlanNode> aggNodes = org.voltdb.planner.TestPlansApproxCountDistinct.findAllAggPlanNodes(frag);
    assertFalse("No aggregation node in fragment!", (0 == (aggNodes.size())));
    assertEquals("More than one aggregation node in fragment!", 1, aggNodes.size());
    org.voltdb.plannodes.AggregatePlanNode aggNode = ((org.voltdb.plannodes.AggregatePlanNode) (aggNodes.get(0)));
    assertAggPlanNodeContainsFunctions(aggNode, expectedAggFns);
}