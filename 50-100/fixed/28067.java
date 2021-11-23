@org.springframework.scheduling.annotation.Scheduled(fixedRate = 1000)
public void checkForEvents() {
    long currentTime = java.lang.System.currentTimeMillis();
    java.util.List<com.greenfox.jasper.services.MainEvent> listedEvents = mainEventRepo.findAllWaitingForExecution(currentTime);
    if ((listedEvents.size()) != 0) {
        for (com.greenfox.jasper.services.MainEvent listedEvent : listedEvents) {
            processEventTest(listedEvent);
        }
    }
    java.lang.System.out.println(("I finished processing the events in: " + ((java.lang.System.currentTimeMillis()) - currentTime)));
}