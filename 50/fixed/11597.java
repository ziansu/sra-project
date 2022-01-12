public boolean addTestExecution(de.fhbingen.wbs.dbaccess.data.TestExecution te) {
    boolean result = de.fhbingen.wbs.dbaccess.DBModelManager.getTestExecutionModel().addNewTestExecution(te);
    de.fhbingen.wbs.dbaccess.repositories.TestCaseExecutionRepository.reloadCache();
    return result;
}