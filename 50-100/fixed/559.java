@org.junit.Test
public void test_findComponents_TruncatesComponentDescriptions_WhenComponentDescriptionsAreTooLong() throws java.lang.Exception {
    com.structurizr.componentfinder.ComponentFinder componentFinder = new com.structurizr.componentfinder.ComponentFinder(webApplication, "com.structurizr.componentfinder", new com.structurizr.componentfinder.JavadocComponentFinderStrategy(sourcePath.getCanonicalPath(), 32));
    componentFinder.findComponents();
    org.junit.Assert.assertEquals("A component that does something.", componentA.getDescription());
    org.junit.Assert.assertEquals("A component that does somethi...", componentB.getDescription());
    org.junit.Assert.assertEquals("A component that does somethi...", componentC.getDescription());
}