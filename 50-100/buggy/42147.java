public static java.lang.String getHTTMethodCount(java.lang.String httpMethod, java.lang.String logpath) {
    java.lang.String[] cmd = new java.lang.String[]{ "/bin/sh" , "-c" , ((("awk -F\\\" \'($2 ~ \"" + httpMethod) + "\")\' ") + logpath) + " | wc -l" };
    io.vertx.core.json.JsonObject jo = new io.vertx.core.json.JsonObject();
    jo.put("count", new com.analytics.loganalytics.ProcessBuilder().executeCountCommand(cmd));
    return jo.toString();
}