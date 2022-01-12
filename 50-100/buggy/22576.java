private void billRunningCostofSport(java.lang.String runId, int hoursAlive, com.endicott.edu.models.SportModel sport) {
    int newCharge = (hoursAlive - (sport.getHourLastUpdated())) * (sport.getCostPerHour());
    com.endicott.edu.simulators.Accountant.payBill(runId, newCharge);
    com.endicott.edu.simulators.NewsManager.createNews(runId, hoursAlive, ((("Charge for " + (sport.getName())) + " $") + newCharge));
}