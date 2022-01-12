@java.lang.Override
public java.lang.Object handle(final spark.Request req, final spark.Response res) {
    spark.QueryParamsMap qm = req.queryMap();
    gameManager.addEmployee();
    java.util.List<java.lang.String> results = new java.util.ArrayList<>();
    java.util.Map<java.lang.String, java.lang.Object> variables = new com.google.common.collect.ImmutableMap.Builder<java.lang.String, java.lang.Object>().put("results", results).build();
    return edu.brown.cs.bse.BlueRoom.Server.GSON.toJson(variables);
}