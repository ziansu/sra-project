public void addConstraint(mondrian.rolap.sql.SqlQuery sqlQuery, mondrian.rolap.sql.RolapCube baseCube, mondrian.rolap.aggmatcher.AggStar aggStar) {
    for (int i = 0; i < (columnList.size()); i++) {
        mondrian.olap.MondrianDef.Expression expression = columnList.get(i);
        final java.lang.Comparable value = valueList.get(i);
        final mondrian.spi.Dialect.Datatype datatype = datatypeList.get(i);
        sqlQuery.addWhere(mondrian.rolap.sql.SqlConstraintUtils.constrainLevel2(sqlQuery, expression, datatype, value));
    }
}