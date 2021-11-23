@org.junit.Test
public void testSpatialDimension() throws java.sql.SQLException {
    final nz.co.gregs.dbvolution.expressions.Point3DExpressionTest.PointTestTable pointTestTable = new nz.co.gregs.dbvolution.expressions.Point3DExpressionTest.PointTestTable();
    nz.co.gregs.dbvolution.expressions.DBQuery dbQuery = database.getDBQuery(pointTestTable);
    dbQuery.addCondition(pointTestTable.column(pointTestTable.point).spatialDimensions().is(2));
    java.util.List<nz.co.gregs.dbvolution.expressions.Point3DExpressionTest.PointTestTable> allRows = dbQuery.getAllInstancesOf(pointTestTable);
    org.junit.Assert.assertThat(allRows.size(), is(3));
}