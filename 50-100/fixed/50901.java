private static void addResources(java.util.List<co.sepulveda.pongee.servlet.resources.ResourceEntity> allResources, java.util.List<co.sepulveda.pongee.servlet.resources.ResourceEntity> resources) {
    for (co.sepulveda.pongee.servlet.resources.ResourceEntity resource : resources) {
        int i = allResources.indexOf(resource);
        if (i != (-1)) {
            allResources.get(i).addMethods(resource.getMethods());
        }else {
            allResources.add(resource);
        }
    }
}