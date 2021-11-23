private void queueResearch(SCBot.ResearchType upgrade) {
    economy.reserveResources(upgrade.mineralCost(), upgrade.gasCost());
    researchQueue.add(upgrade);
}