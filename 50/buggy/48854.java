@java.lang.Override
public void run() {
    net.rutger.wateringsystem.WateringTimerTask.logger.debug(("Running garden water task at " + (java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME))));
    net.rutger.wateringsystem.WateringTimerTask.runGardenWaterTask();
}