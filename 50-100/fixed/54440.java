@org.springframework.scheduling.annotation.Scheduled(cron = "${scheduling.job}")
public void reportCurrentTime() {
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate();
    br.com.model.Rss myRss = restTemplate.getForObject(br.com.scheduler.ScheduledTasks.url, br.com.model.Rss.class);
    if (myRss != null) {
        service.save(myRss);
    }
    br.com.scheduler.ScheduledTasks.log.info(myRss.toString());
}