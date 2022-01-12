public int getInstanceCount(core.world.WorldResource resource) {
    if (resource == null) {
        return 0;
    }
    int count = 0;
    for (io.resource.DataRef reference : referenceList) {
        final core.world.WorldResource current = reference.getResource();
        if (current.getReferenceName().equalsIgnoreCase(resource.getReferenceName())) {
            count++;
        }
    }
    return count;
}