public static com.stratio.crossdata.common.logicalplan.Filter createFilter(java.lang.String catalogName, java.lang.String tableName, java.lang.String columnName, com.stratio.crossdata.common.statements.structures.Operator operator, java.lang.Integer data, boolean indexed) {
    com.stratio.crossdata.common.statements.structures.ColumnSelector leftSelector = new com.stratio.crossdata.common.statements.structures.ColumnSelector(new com.stratio.crossdata.common.data.ColumnName(catalogName, tableName, columnName));
    com.stratio.crossdata.common.statements.structures.IntegerSelector rightSelector = new com.stratio.crossdata.common.statements.structures.IntegerSelector(data);
    com.stratio.crossdata.common.statements.structures.Relation relation = new com.stratio.crossdata.common.statements.structures.Relation(leftSelector, operator, rightSelector);
    com.stratio.crossdata.common.logicalplan.Filter filter = new com.stratio.crossdata.common.logicalplan.Filter(com.stratio.connector.deep.LogicalWorkflowBuilder.retrieveFilterOperation(operator, indexed), relation);
    return filter;
}