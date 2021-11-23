public java.util.Vector readAllTestModelSummaries(org.eclipse.persistence.testing.framework.Expression expression) {
    org.eclipse.persistence.testing.framework.ReadAllQuery query = new org.eclipse.persistence.testing.framework.ReadAllQuery(org.eclipse.persistence.testing.framework.TestResultsSummary.class, expression);
    query.addAscendingOrdering("name");
    query.addOrdering(query.getExpressionBuilder().get("loadBuildSummary").get("timestamp").ascending());
    query.addJoinedAttribute("loadBuildSummary");
    return ((java.util.Vector) (session.executeQuery(query)));
}