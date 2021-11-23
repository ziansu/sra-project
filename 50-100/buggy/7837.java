@org.springframework.scheduling.annotation.Async
@org.springframework.scheduling.annotation.Scheduled(cron = "0 0 0 * * *")
private void execute() {
    java.lang.Integer history = null;
    try {
        history = config.getInteger(ConfigProperty.EXECUTION_LOG_HISTORY);
    } finally {
    }
    if ((history == null) || (history <= (-1))) {
        return ;
    }
    java.util.Calendar pruneLine = java.util.Calendar.getInstance();
    pruneLine.setTime(new java.util.Date());
    pruneLine.add(java.util.Calendar.DAY_OF_YEAR, (-history));
    dbLog.prune(pruneLine.getTime());
}