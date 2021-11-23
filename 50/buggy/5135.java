@java.lang.Override
public void onSuccess(java.lang.Object result) throws java.lang.Throwable {
    if (result instanceof com.blackenedsystems.sportsbook.data.betfair.akka.BetfairWorkflowActor.Complete) {
        com.blackenedsystems.sportsbook.data.SportsbookDataImporterApplication.LOGGER.debug("Got a Complete message as expected!");
    }
    actorService.shutdown();
    java.lang.System.exit(0);
}