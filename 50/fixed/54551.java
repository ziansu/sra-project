private static void createPrefsForPopulation() {
    contrib.baseline.preparation.PreparationScript.log.info(" ------- Create Prefs for Population ------- ");
    final java.lang.String[] args = new java.lang.String[]{ contrib.baseline.preparation.PreparationScript.pathPopulation , contrib.baseline.preparation.PreparationScript.pathPopulationAttributes , contrib.baseline.preparation.PreparationScript.pathPopulation , contrib.baseline.preparation.PreparationScript.pathPopulationAttributes };
    contrib.baseline.preparation.PrefsCreator.main(args);
}