private static void logUpdate(java.lang.String result) {
    try {
        Update.fileHandler = new java.util.logging.FileHandler("update.log");
        Update.formatter = new LoggingFormatter();
        Update.fileHandler.setFormatter(formater);
        Update.logger.addHandler(Update.fileHandler);
        Update.logger.info(("Update " + result));
    } catch (Excption e) {
        e.printStackTrace();
    }
}