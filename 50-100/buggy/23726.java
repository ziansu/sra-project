@org.springframework.scheduling.annotation.Scheduled(fixedDelay = 5000)
public void sendTracking() {
    com.thinkenterprise.domain.tracking.Tracking tracking = new com.thinkenterprise.domain.tracking.Tracking();
    tracking.setRouteId(40L);
    tracking.setFlightNumber("LH7902");
    tracking.setCurrentTime(java.time.LocalDateTime.now());
    tracking.setStatus(FlightStatus.DELAYED);
    com.thinkenterprise.repository.TrackingRepository repository = com.thinkenterprise.Application.context.getBean(com.thinkenterprise.repository.TrackingRepository.class);
    if (repository != null) {
        repository.save(tracking);
    }
}