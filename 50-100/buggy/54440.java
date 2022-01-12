@org.springframework.scheduling.annotation.Scheduled(cron = "${scheduling.job}")
public void reportCurrentTime() {
    br.com.scheduler.ScheduledTasks.log.info("The time is now {}", br.com.scheduler.ScheduledTasks.dateFormat.format(new java.util.Date()));
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate();
    br.com.model.Rss myRss = restTemplate.getForObject(br.com.scheduler.ScheduledTasks.url, br.com.model.Rss.class);
    if (myRss != null) {
        service.save(myRss);
    }
    br.com.scheduler.ScheduledTasks.log.info(myRss.toString());
}