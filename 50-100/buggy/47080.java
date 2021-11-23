public void compareLevelOneMasteries() {
    scenario.UrgotScenario thunderlord = new scenario.UrgotScenario(1);
    scenario.UrgotScenario deathfire = new scenario.UrgotScenario(1);
    scenario.UrgotScenario bond = new scenario.UrgotScenario(1);
    thunderlord.addMasteries(MasterySet.THUNDERLORD_BALANCED);
    thunderlord.addMasteries(MasterySet.DEATHFIRE_BALANCED);
    thunderlord.addMasteries(MasterySet.BOND_BALANCED);
    addScenario(thunderlord, "Thunderlord Mastery Start");
    addScenario(deathfire, "Deathfire Mastery Start");
    addScenario(bond, "Bond of Stone Start");
}