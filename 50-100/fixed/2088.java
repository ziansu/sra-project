@java.lang.SuppressWarnings(value = "unchecked")
public void storeSettingsIntoConfigFile() {
    org.json.simple.JSONObject configJson = new org.json.simple.JSONObject();
    configJson.put("data file location", com.nexus.simplify.database.Database.DEFAULT_DATA_FILE_LOCATION);
    java.lang.String outputConfigFilePath = (com.nexus.simplify.database.Database.CONFIG_FILE_LOCATION) + (com.nexus.simplify.database.Database.CONFIG_FILE_NAME);
    java.io.File outputConfigFile = new java.io.File(outputConfigFilePath);
    try {
        java.io.FileWriter fileWriter = new java.io.FileWriter(outputConfigFilePath);
        fileWriter.write(configJson.toJSONString());
        fileWriter.flush();
        fileWriter.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}