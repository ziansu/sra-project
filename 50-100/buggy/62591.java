@org.junit.Test
public void testAllWithSortedBundles() throws java.lang.Exception {
    java.lang.Thread.sleep(1000);
    setupSortedBundles();
    framework = org.eclipse.concierge.Concierge.doMain(new java.lang.String[]{ "-Dorg.eclipse.concierge.debug=true" , "-Dorg.osgi.framework.storage.clean=onFirstInit" , "-all" , dir });
    org.junit.Assert.assertNotNull(framework);
    org.osgi.framework.Bundle[] bundles = framework.getBundleContext().getBundles();
    org.junit.Assert.assertEquals(4, bundles.length);
    assertBundlesActive(bundles);
}