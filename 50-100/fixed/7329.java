private static void startWorker(ru.bigspawn.parser.bot.Bot bot, java.lang.String url) throws java.io.UnsupportedEncodingException {
    ru.bigspawn.parser.parser.AlterPortalParser parser = new ru.bigspawn.parser.parser.AlterPortalParser(url);
    java.lang.String loggerName = ru.bigspawn.parser.Utils.getLoggerNameFromUrl(url);
    ru.bigspawn.parser.Worker worker = new ru.bigspawn.parser.Worker(parser, bot, loggerName);
    ru.bigspawn.parser.Main.logger.debug(("Create " + worker));
    java.lang.Thread thread = new java.lang.Thread(worker, ("Thread: " + loggerName));
    thread.start();
    ru.bigspawn.parser.Main.logger.debug(("Start " + thread));
}