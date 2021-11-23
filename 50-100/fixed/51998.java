public void completeResearch(hu.openig.model.ResearchType rt) {
    hu.openig.model.Research r = researches.remove(rt);
    if (r != null) {
        r.state = ResearchState.COMPLETE;
        r.remainingMoney = 0;
        r.assignedMoney = 0;
        setAvailable(rt);
        (statistics.researchCount.value)++;
        (world.statistics.researchCount.value)++;
    }
}