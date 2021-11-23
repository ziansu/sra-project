public static junit.framework.Test suite() {
    junit.framework.TestSuite suite = new junit.framework.TestSuite();
    if (!(org.eclipse.jface.util.Util.isMac())) {
        suite.addTest(org.eclipse.team.tests.ccvs.core.cvsresources.AllTestsCVSResources.suite());
        suite.addTest(org.eclipse.team.tests.ccvs.core.jsch.AllJschTests.suite());
    }
    return new junit.extensions.TestSetup(suite);
}