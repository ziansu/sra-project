private static void parseStateSummary(java.lang.String stateSummaryResp, java.util.List<SlaveDetails> slaveLst, java.util.List<FrameworkDetails> frameworkDetailsLst, java.util.List<FrameworkSlaveRelationship> runsOn) {
    com.google.gson.JsonElement stateSummary = new com.google.gson.JsonParser().parse(stateSummaryResp);
    com.google.gson.JsonArray slaves = stateSummary.getAsJsonObject().getAsJsonArray("slaves");
    com.google.gson.JsonArray frameworks = stateSummary.getAsJsonObject().getAsJsonArray("frameworks");
    MesosMetric.processSlaveDetails(slaves, slaveLst, runsOn);
    MesosMetric.processFrameworkDetails(frameworks, frameworkDetailsLst);
}