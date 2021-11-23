private static void populateInitFile(java.lang.String race, java.lang.String map, java.lang.String scDir) {
    java.lang.String bwapiDest = scDir + "\\bwapi-data\\bwapi.ini";
    java.lang.String iniFile = eisbw.WindowsTools.getIniFile(race, map);
    try {
        java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter(new java.io.File(bwapiDest)));
        out.write(iniFile);
        out.close();
    } catch (java.lang.Exception exception) {
        java.util.logging.Logger.getLogger("StarCraft Logger").log(java.util.logging.Level.SEVERE, "Could not write config file.", exception);
    }
}