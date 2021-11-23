private java.util.List<java.lang.String> loadClasses(boolean includeJars, java.lang.String... cpJars) {
    org.junit.extensions.dynamicsuite.engine.ClassPathScanner scanner = new org.junit.extensions.dynamicsuite.engine.ClassPathScanner(includeJars, cpJars);
    java.util.List<java.lang.String> classes = scanner.listClassNames();
    org.junit.Assert.assertNotNull(classes);
    return classes;
}