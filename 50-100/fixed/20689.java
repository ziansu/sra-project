private static com.puppycrawl.tools.checkstyle.api.RootModule getRootModule(java.lang.String name, java.lang.ClassLoader moduleClassLoader) throws com.puppycrawl.tools.checkstyle.api.CheckstyleException {
    final com.puppycrawl.tools.checkstyle.ModuleFactory factory = new com.puppycrawl.tools.checkstyle.PackageObjectFactory(com.puppycrawl.tools.checkstyle.Checker.class.getPackage().getName(), moduleClassLoader);
    return ((com.puppycrawl.tools.checkstyle.api.RootModule) (factory.createModule(name)));
}