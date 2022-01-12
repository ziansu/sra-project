@org.springframework.scheduling.annotation.Scheduled(fixedRate = 10000)
public void scheduledReportGenerator() {
    java.util.List<com.bananasuitproductions.Subscriber> activeSubs = subscriberDao.getSubs();
    for (com.bananasuitproductions.Subscriber s : activeSubs) {
        java.lang.System.out.println(((("generating report for: " + (s.getEmail())) + ", ") + (s.getZip())));
        getHourlyForecastFromWg(s.getZip());
    }
}