public static java.lang.String getTopUrls(int number, java.lang.String logPath) {
    java.lang.String[] cmd = new java.lang.String[]{ "/bin/sh" , "-c" , (("cut -d\'\"\' -f4 " + logPath) + " | grep -v '^-$' | sort | uniq -c | sort -rg | head -n") + number };
    java.util.List<java.lang.String> keys = new java.util.ArrayList<>(java.util.Arrays.asList("hits", "url"));
    io.vertx.core.json.JsonObject jo = new io.vertx.core.json.JsonObject();
    jo.put("TopUrls", com.analytics.loganalytics.ProcessBuilder.executeTopCommand(cmd, keys));
    return jo.toString();
}