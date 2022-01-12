static void constructConnectionSummary(java.util.Map<java.lang.Integer, java.lang.Integer> maxConnectionPerRun, net.sf.json.JSONObject scenarioStats) {
    net.sf.json.JSONObject maxConnectionsSummary = new net.sf.json.JSONObject();
    int connectionSum = 0;
    for (java.lang.Integer runConnectionMax : maxConnectionPerRun.values()) {
        if (runConnectionMax > 0) {
            connectionSum += runConnectionMax;
            continue;
        }
    }
    double connectionMaxAverage = ((double) (connectionSum)) / (maxConnectionPerRun.size());
    maxConnectionsSummary.put("AvgMaxConnection", connectionMaxAverage);
    scenarioStats.put("AvgMaxConnections", maxConnectionsSummary);
}