@java.lang.Override
public java.lang.Object handle(spark.Request request, spark.Response response) throws java.lang.Exception {
    log.info("PivotTableController was called");
    java.lang.String name = request.params("pvtTblSchema");
    ca.concordia.pivottable.entities.PivotTableSchema schema = ca.concordia.pivottable.entities.PivotTableSchema.fromJSON(request.body());
    if (name == null) {
        response.status(400);
        return null;
    }
    ca.concordia.pivottable.entities.PivotTable pivotTable = dataRetrievalService.getPivotTable(schema);
    response.status(200);
    response.header("Content-Type", "application/json");
    return pivotTable.toJSON();
}