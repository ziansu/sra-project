@java.lang.Override
protected void init() throws java.lang.Exception {
    super.init();
    driver = sqlDriver = new hu.bme.mit.trainbenchmark.benchmark.memsql.driver.MemSQLDriver();
    checker = new hu.bme.mit.trainbenchmark.benchmark.sql.benchmarkcases.SQLChecker(sqlDriver, bc);
    if ((bc.getScenario()) != (hu.bme.mit.trainbenchmark.constants.Scenario.BATCH)) {
        transformation = hu.bme.mit.trainbenchmark.benchmark.sql.transformations.SQLTransformation.newInstance(sqlDriver, bc);
    }
}