@org.springframework.scheduling.annotation.Scheduled(cron = "0 0 0/6 * * ?")
public void reportCurrentTime() {
    if (!(isStarted)) {
        log.info("[JobExtractor] Starting extractor.. : {} ", new java.util.Date());
        extractorEngine.start();
        log.info("[JobExtractor] Closing extractor.. : {} ", new java.util.Date());
    }
}