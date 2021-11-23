public static java.util.List<co.sepulveda.pongee.servlet.resources.ResourceEntity> parseObjects(java.util.List<java.lang.Object> controllers) {
    java.util.List<co.sepulveda.pongee.servlet.resources.ResourceEntity> allResources = new java.util.ArrayList();
    for (java.lang.Object controller : controllers) {
        java.util.List<co.sepulveda.pongee.servlet.resources.ResourceEntity> resources = co.sepulveda.pongee.servlet.resources.parser.ResourcesParser.getResources(controller);
        co.sepulveda.pongee.servlet.resources.parser.ResourcesParser.addResources(allResources, resources);
    }
    return allResources;
}