public static java.lang.String getTopUserAgents(int number, java.lang.String logPath) {
    java.lang.String[] cmd = new java.lang.String[]{ "/bin/sh" , "-c" , (("cat " + logPath) + " | awk -F\\\" \'{ print $6 }\' | sort | uniq -c | sort -frn | head -n ") + number };
    com.analytics.loganalytics.ProcessBuilder obj = new com.analytics.loganalytics.ProcessBuilder();
    java.util.List<java.lang.String> keys = new java.util.ArrayList<>(java.util.Arrays.asList("hits", "user-agent"));
    io.vertx.core.json.JsonObject jo = new io.vertx.core.json.JsonObject();
    jo.put("Top-UserAgents", com.analytics.loganalytics.ProcessBuilder.executeTopCommand(cmd, keys));
    return jo.toString();
}