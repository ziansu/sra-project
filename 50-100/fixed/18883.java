@java.lang.SuppressWarnings(value = "CallToSystemSetSecurityManager")
@org.testng.annotations.Test(timeOut = 120000)
public void testRestrictedEnvironment() throws io.github.pr0methean.betterrandom.seed.SeedException {
    final java.lang.Thread affectedThread = java.lang.Thread.currentThread();
    final java.lang.SecurityManager securityManager = java.lang.System.getSecurityManager();
    try {
        java.lang.System.setSecurityManager(new io.github.pr0methean.betterrandom.seed.DefaultSeedGeneratorTest.RestrictedSecurityManager(affectedThread));
        DefaultSeedGenerator.DEFAULT_SEED_GENERATOR.generateSeed(new byte[4]);
    } finally {
        java.lang.System.setSecurityManager(securityManager);
    }
}