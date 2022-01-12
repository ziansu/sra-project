public void setCleaningService(int numOfTeams, int price, int secondsPerAutoClean) {
    cleanService = new bl.CleaningService(numOfTeams, price, secondsPerAutoClean);
}