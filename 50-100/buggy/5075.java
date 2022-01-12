public void testRSEgd() throws java.lang.Exception {
    it.unibas.lunatic.Scenario scenario = it.unibas.lunatic.test.UtilityTest.loadScenarioFromResources(References.RS_egd_dbms);
    speedy.model.database.IDatabase result = it.unibas.lunatic.model.chase.chasede.DEChaserFactory.getChaser(scenario).doChase(scenario);
    if (it.unibas.lunatic.test.de.dbms.TestSQLChaseEgd.logger.isDebugEnabled())
        it.unibas.lunatic.test.de.dbms.TestSQLChaseEgd.logger.debug(result.toString());
    
    checkExpectedInstances(result, scenario);
}