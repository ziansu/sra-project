public void addNewLevelUpEvent(long buildingID) {
    com.greenfox.jasper.domain.Building temporaryBuilding = buildingServices.findOneBuilding(((int) (buildingID)));
    com.greenfox.jasper.services.MainEvent levelUpEvent = new com.greenfox.jasper.services.LevelUpEvent(buildingID, ((java.lang.System.currentTimeMillis()) + (60000 * (calculateBuildingTime(temporaryBuilding.getLevel())))));
    mainEventRepo.save(levelUpEvent);
}