private void execute(final io.toast.tk.dao.domain.impl.test.block.ITestPlan testPlan, final io.toast.tk.runtime.TestRunner runner) {
    initEnvironment();
    for (final io.toast.tk.dao.domain.impl.test.block.ICampaign campaign : testPlan.getCampaigns()) {
        for (io.toast.tk.dao.domain.impl.test.block.ITestPage testPage : campaign.getTestCases()) {
            try {
                beginTest();
                runner.run(testPage);
                endTest();
            } catch (final java.lang.Exception e) {
                io.toast.tk.runtime.AbstractTestPlanRunner.LOG.error(e.getMessage(), e);
            }
        }
    }
    createAndOpenReport(testPlan);
    tearDownEnvironment();
}