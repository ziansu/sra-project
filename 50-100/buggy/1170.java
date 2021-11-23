public void notify(java.util.List<model.Player> addedPlayers) {
    scheduler = schedulerManager.getScheduler();
    java.util.List<model.Player> allPlayers = getAllPlayers(addedPlayers);
    java.util.Date calculatedRunTime = nextRunTimeCalculator.calculateNextRuntime(allPlayers, nextRunTime);
    if (!(calculatedRunTime.equals(nextRunTime))) {
        nextRunTime = calculatedRunTime;
        scheduleNextRun();
    }
    playerRepository.save(allPlayers);
}