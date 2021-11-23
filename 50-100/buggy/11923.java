@org.junit.Test
public void testNullInsideObjects() {
    eu.europa.fisheries.uvms.rules.service.mapper.fact.FishingActivity faAct = new eu.europa.fisheries.uvms.rules.service.mapper.fact.FishingActivity();
    final java.util.List<eu.europa.fisheries.uvms.rules.service.mapper.fact.FaCatchFact> faCatchFacts = activityMapper.generateFactsForFaCatch(faAct);
    java.util.List<eu.europa.fisheries.uvms.rules.service.mapper.fact.GearProblem> gearList = new java.util.ArrayList<eu.europa.fisheries.uvms.rules.service.mapper.fact.GearProblem>() {
        {
            add(new eu.europa.fisheries.uvms.rules.service.mapper.fact.GearProblem());
        }
    };
    activityMapper.generateFactsForGearProblems(gearList);
}