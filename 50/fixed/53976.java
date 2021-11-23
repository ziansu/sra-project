public static final java.util.List<org.corehunter.CoreHunterMeasure> getAllowedMeasures(org.corehunter.data.CoreHunterData coreHunterData, org.corehunter.CoreHunterObjectiveType objectiveType) {
    return org.corehunter.API.getAllowedMeasures(coreHunterData.hasGenotypes(), coreHunterData.hasPhenotypes(), coreHunterData.hasDistances(), objectiveType);
}