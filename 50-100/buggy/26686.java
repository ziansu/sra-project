public static java.util.List<co.sepulveda.pongee.servlet.resources.ResourceEntity> parsePackage(java.lang.String packageName) {
    org.reflections.Reflections reflections = new org.reflections.Reflections(packageName, new org.reflections.scanners.SubTypesScanner(false));
    java.util.Set<java.lang.String> allControllersInPackage = reflections.getStore().getSubTypesOf(java.lang.Object.class.getName());
    java.util.List<co.sepulveda.pongee.servlet.resources.ResourceEntity> allResources = new java.util.ArrayList();
    for (java.lang.String className : allControllersInPackage) {
        java.util.List<co.sepulveda.pongee.servlet.resources.ResourceEntity> resources = co.sepulveda.pongee.servlet.resources.parser.ResourcesParser.getResources(className);
        co.sepulveda.pongee.servlet.resources.parser.ResourcesParser.addResources(allResources, resources);
    }
    return allResources;
}