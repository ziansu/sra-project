public static java.lang.String getTopResponseCodes(java.lang.String logpath) {
    java.lang.String[] cmd = new java.lang.String[]{ "/bin/sh" , "-c" , ("cat " + logpath) + " | awk '{print $9}' | sort | uniq -c | sort -nr" };
    io.vertx.core.json.JsonObject jo = new io.vertx.core.json.JsonObject();
    java.util.List<java.lang.String> keys = new java.util.ArrayList<>(java.util.Arrays.asList("hits", "http-code"));
    jo.put("User-Agents", new com.analytics.loganalytics.ProcessBuilder().executeTopCommand(cmd, keys));
    return jo.toString();
}