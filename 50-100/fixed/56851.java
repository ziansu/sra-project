@org.junit.Test
public void testGetRulesFromSuppressionFileInClasspath() throws java.lang.Exception {
    org.owasp.dependencycheck.utils.Settings.setString(Settings.KEYS.SUPPRESSION_FILE, "suppressions.xml");
    instance.initialize();
    int expCount = 5;
    java.util.List<org.owasp.dependencycheck.suppression.SuppressionRule> result = instance.getRules();
    org.junit.Assert.assertTrue((expCount <= (result.size())));
}