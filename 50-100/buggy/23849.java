public void newLinkData(de.unisaarland.edutech.conceptmapping.Concept c1, de.unisaarland.edutech.conceptmapping.Concept c2, de.unisaarland.edutech.conceptmapping.Link l) {
    de.unisaarland.edutech.conceptmapfx.datalogging.UserSummary userSummary = getUserSummaryForUser(c1.getOwner());
    userSummary.incLinkCount();
    totalSummary.incLinkCount();
    if (!(c1.getOwner().equals(c2.getOwner()))) {
        userSummary = getUserSummaryForUser(c2.getOwner());
        userSummary.incLinkCount();
    }
    addRow(de.unisaarland.edutech.conceptmapfx.datalogging.InteractionLogger.Event.NEW_LINK, c1, c2, l, null);
}