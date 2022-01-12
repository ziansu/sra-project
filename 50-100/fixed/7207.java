public void writePlans(final java.lang.String outputDir) {
    new org.matsim.core.population.PopulationWriter(scenario.getPopulation()).write((((outputDir + "/initial_urban_plans_") + (cloningFactor)) + "pct.xml.gz"));
    new org.matsim.utils.objectattributes.ObjectAttributesXmlWriter(scenario.getPopulation().getPersonAttributes()).writeFile((((outputDir + "/initial_urban_persionAttributes_") + (cloningFactor)) + "pct.xml.gz"));
    playground.agarwalamit.mixedTraffic.patnaIndia.input.urban.PatnaUrbanDemandGenerator.LOG.info("Writing Plan and person attributes files are finished.");
}