private static void setPropertiesForLevel(java.util.Properties p, java.lang.String logger, water.util.Log.LEVEL level) {
    water.util.Log.setPropertiesFor(p, logger, "%m%n", level.name());
}