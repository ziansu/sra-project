@javax.annotation.PostConstruct
public void init() {
    fintEvents.registerUpstreamListener(no.fint.consumer.service.SubscriberService.class, "mock.no");
    healthCheck = fintEventsHealth.registerClient();
}