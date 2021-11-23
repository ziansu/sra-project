public void addNewLevelUpEvent(long buildingID) {
    com.greenfox.jasper.domain.Building temporaryBuilding = buildingServices.findOneBuilding(((int) (buildingID)));
    com.greenfox.jasper.services.MainEvent levelUpEvent = new com.greenfox.jasper.services.LevelUpEvent(((java.lang.System.currentTimeMillis()) + (calculateBuildingTime(temporaryBuilding))), buildingID);
    mainEventRepo.save(levelUpEvent);
}