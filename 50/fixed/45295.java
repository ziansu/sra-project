public static de.zabuza.parbot.logging.ILogger getLogger() {
    if ((de.zabuza.parbot.logging.LoggerFactory.loggerInstance) == null) {
        de.zabuza.parbot.logging.LoggerFactory.loggerInstance = new de.zabuza.parbot.logging.HtmlLogger(false);
    }
    return de.zabuza.parbot.logging.LoggerFactory.loggerInstance;
}