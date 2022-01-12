private void migrateRunningInstances() {
    de.uni_potsdam.hpi.bpt.bp2014.jcomparser.Connector connector = new de.uni_potsdam.hpi.bpt.bp2014.jcomparser.Connector();
    connector.migrateScenarioInstance(migratingScenarioDbID, databaseID);
    for (de.uni_potsdam.hpi.bpt.bp2014.jcomparser.xml.Fragment fragment : fragments) {
        if (!(newFragments.contains(fragment))) {
            fragment.migrate(migratingScenarioDbID);
        }
    }
    migrateDataObjects();
}