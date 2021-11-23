public static void initialize() {
    com.mygdx.ouyagame.debug.DebugHelper.log("GameSettings", "initialized.");
    com.mygdx.ouyagame.settings.GameSettings.settings = new java.util.LinkedHashMap<java.lang.String, com.mygdx.ouyagame.settings.Setting>();
    com.mygdx.ouyagame.settings.GameSettings.add(com.mygdx.ouyagame.settings.GameSettings.SCREEN_RESOLUTION_WIDTH, 1280).makeFinal();
    com.mygdx.ouyagame.settings.GameSettings.add(com.mygdx.ouyagame.settings.GameSettings.SCREEN_RESOLUTION_HEIGHT, 720).makeFinal();
    com.mygdx.ouyagame.settings.GameSettings.add(com.mygdx.ouyagame.settings.GameSettings.NUMBER_OF_PLAYERS, 1).setModSteps(2).setMinMax(0, 4);
}