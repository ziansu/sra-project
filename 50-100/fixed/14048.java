@org.springframework.scheduling.annotation.Scheduled(cron = "0 0 0 * * ?")
public void deleteLogsSevenDaysAgo() {
    java.time.LocalDate dateSevenDaysAgo = java.time.LocalDate.now().minusDays(7L);
    long dateSevenDaysAgoTs = java.sql.Timestamp.valueOf(dateSevenDaysAgo.atStartOfDay()).getTime();
    try {
        logRepository.deleteInBatch(logRepository.findByDateBefore(dateSevenDaysAgoTs));
    } catch (java.lang.IllegalArgumentException e) {
    }
}