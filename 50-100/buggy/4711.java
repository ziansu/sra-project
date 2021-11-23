@org.zanata.arquillian.RemoteBefore
public void prepareDataBeforeTest() {
    org.zanata.RestTest.log.info("Executing prepareDataBeforeTest()");
    java.lang.String dataSetToClear = getDataSetToClear();
    if (dataSetToClear != null) {
        addBeforeTestOperation(new org.zanata.provider.DBUnitProvider.DataSetOperation(dataSetToClear, org.dbunit.operation.DatabaseOperation.DELETE_ALL));
    }
    prepareDBUnitOperations();
    if (dataSetToClear != null) {
        addAfterTestOperation(new org.zanata.provider.DBUnitProvider.DataSetOperation(dataSetToClear, org.dbunit.operation.DatabaseOperation.DELETE_ALL));
    }
    dbUnitProvider.prepareDataBeforeTest();
    entityManagerFactory().getCache().evictAll();
}