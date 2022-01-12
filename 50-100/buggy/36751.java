private static void prettyPrintJson(final java.lang.String jsonString) {
    if (org.apache.commons.lang3.StringUtils.isBlank(jsonString)) {
        org.apache.falcon.cli.FalconExtensionCLI.OUT.get().println("No result returned");
        return ;
    }
    com.google.gson.Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
    com.google.gson.JsonParser jp = new com.google.gson.JsonParser();
    com.google.gson.JsonElement je = jp.parse(jsonString.trim());
    org.apache.falcon.cli.FalconExtensionCLI.OUT.get().println(gson.toJson(je));
}