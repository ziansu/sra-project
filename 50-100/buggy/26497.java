public static void loadData() {
    try {
        danielm59.deathlog.handler.LogHandler.data = ((java.util.LinkedHashMap<java.lang.String, java.lang.Integer>) (danielm59.deathlog.utility.IOHelper.readObject(DeathLog.proxy.getLogPath())));
    } catch (java.io.IOException e) {
        danielm59.deathlog.utility.LogHelper.info("Death data not found");
    }
}