@play.mvc.Finally(only = { "generate" })
private static void log() {
    if ((controllers.Application.watch) != null) {
        controllers.Application.watch.stop();
        play.Logger.info("Generated documentation as PDF successfully in %s", org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(controllers.Application.watch.getTime(), true, true));
        controllers.Application.watch = null;
    }else {
        play.Logger.info("Generated documentation as HTML successfully");
    }
}