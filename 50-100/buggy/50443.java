public static junit.framework.Test suite() {
    junit.framework.TestSuite suite = new junit.framework.TestSuite();
    if (!(org.eclipse.jface.util.Util.isMac())) {
        suite.addTest(org.eclipse.team.tests.ccvs.core.provider.AllTestsProvider.suite());
        suite.addTest(org.eclipse.team.tests.ccvs.core.subscriber.AllTestsTeamSubscriber.suite());
        suite.addTest(org.eclipse.team.tests.ccvs.ui.AllUITests.suite());
        suite.addTest(org.eclipse.team.tests.ccvs.core.mappings.ResourceMapperTests.suite());
    }
    return new org.eclipse.team.tests.ccvs.core.CVSUITestSetup(suite);
}