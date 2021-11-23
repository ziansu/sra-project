@java.lang.Override
public de.fhbingen.wbs.dbaccess.data.TestExecution getLastExecution(de.fhbingen.wbs.dbaccess.data.TestCase testcase) {
    java.util.List<de.fhbingen.wbs.dbaccess.data.TestExecution> execList = getExecutionsForTestCase(testcase);
    de.fhbingen.wbs.dbaccess.data.TestExecution latestExec = null;
    if ((execList.size()) > 0) {
        latestExec = execList.get(((execList.size()) - 1));
    }
    return latestExec;
}