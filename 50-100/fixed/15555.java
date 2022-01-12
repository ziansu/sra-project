@org.springframework.web.bind.annotation.RequestMapping(value = "/run_ts/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String runID(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Integer id) throws java.lang.Exception {
    insynctive.model.Account nightlyAcc = accDao.getAccountByID(NIGHTLY_ACCOUNT_ID);
    insynctive.model.test.TestSuite ts = testSuiteDao.getTestByID(id);
    insynctive.model.test.run.TestSuiteRun tsRun = testRunner.getTestSuiteRun(ts, "automationQA", "FIREFOX", nightlyAcc);
    testSuiteRunDao.save(tsRun);
    testRunner.runTest(tsRun, nightlyAcc);
    return "{\"status\" : 200}";
}