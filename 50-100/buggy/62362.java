private boolean validateLogFileMetadata(com.google.gson.JsonObject logFile) {
    if (!(logFile.get("name").getAsString().equals(com.roboclub.robobuggy.simulation.SensorPlayer.METADATA_NAME))) {
        return false;
    }
    if ((logFile.get("schema_version").getAsDouble()) != (com.roboclub.robobuggy.simulation.SensorPlayer.METADATA_SCHEMA_VERSION)) {
        return false;
    }
    if (!(logFile.get("software_version").getAsString().equals(com.roboclub.robobuggy.simulation.SensorPlayer.METADATA_HIGHLEVEL_SW_VERSION))) {
        return false;
    }
    return true;
}