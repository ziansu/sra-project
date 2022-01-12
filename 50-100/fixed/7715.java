@org.junit.Test
public void test_findComponents() throws java.lang.Exception {
    com.structurizr.componentfinder.ComponentFinder componentFinder = new com.structurizr.componentfinder.ComponentFinder(webApplication, "com.structurizr.componentfinder", new com.structurizr.componentfinder.JavadocComponentFinderStrategy(sourcePath.getCanonicalPath()));
    componentFinder.findComponents();
    org.junit.Assert.assertEquals("A component that does something.", componentA.getDescription());
    org.junit.Assert.assertEquals("A component that does something else.", componentB.getDescription());
    org.junit.Assert.assertEquals("A component that does something else too.", componentC.getDescription());
}