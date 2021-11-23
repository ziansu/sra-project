public static void initializeLogger() {
    try {
        com.spanish_inquisition.battleship.common.AppLogger.handler = new java.util.logging.FileHandler("Battleship.log", false);
    } catch (java.io.IOException e) {
        com.spanish_inquisition.battleship.common.AppLogger.logger.log(java.util.logging.Level.WARNING, "Could not create file");
        e.printStackTrace();
    }
    com.spanish_inquisition.battleship.common.AppLogger.handler.setFormatter(new java.util.logging.SimpleFormatter());
    com.spanish_inquisition.battleship.common.AppLogger.logger.addHandler(com.spanish_inquisition.battleship.common.AppLogger.handler);
    com.spanish_inquisition.battleship.common.AppLogger.logger.setLevel(java.util.logging.Level.CONFIG);
}