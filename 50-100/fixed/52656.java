@java.lang.Override
public java.util.List<com.holz.web.models.Feeding> getAllFeedings(int farmId) {
    java.util.List<com.holz.web.models.Feeding> feedings = this.feedingDao.getAllActiveFeedings(farmId);
    for (com.holz.web.models.Feeding fdg : feedings) {
        fdg.setFeeds(this.feedDao.getFeedsForFeeding(fdg.getId()));
        com.holz.web.models.GroupedHerd groupedHerd = this.groupedHerdDao.getGroupedHerdForFeeding(fdg.getId(), farmId);
        fdg.setGroupedHerd(groupedHerd);
    }
    return feedings;
}