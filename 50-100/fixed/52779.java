private static void log(java.lang.String logMessage) {
    try {
        com.xelitexirish.logbot.utils.BotLogger.logFolder.mkdirs();
        if (!(com.xelitexirish.logbot.handlers.FileHandler.doesFileExist(com.xelitexirish.logbot.utils.BotLogger.logFile))) {
            com.xelitexirish.logbot.utils.BotLogger.logFile.createNewFile();
        }
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(com.xelitexirish.logbot.utils.BotLogger.logFile, true));
        printWriter.println(logMessage);
        printWriter.flush();
        printWriter.close();
        java.lang.System.out.println(logMessage);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}