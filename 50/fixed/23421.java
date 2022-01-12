private static void loadDefaultLogTypes() {
    com.marz.snapprefs.Logger.log("Loading default LogTypes", com.marz.snapprefs.Logger.LogType.FORCED);
    for (com.marz.snapprefs.Logger.LogType type : com.marz.snapprefs.Logger.LogType.values())
        com.marz.snapprefs.Logger.logTypes.add(type.name());
    
    com.marz.snapprefs.Logger.saveSelectedLogTypes();
}