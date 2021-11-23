public int getInstanceCount(core.world.WorldResource resource) {
    if (resource == null) {
        return 0;
    }
    int count = 0;
    for (int i = 0; i < (referenceList.size()); i++) {
        final io.resource.DataRef reference = referenceList.get(i);
        final core.world.WorldResource current = reference.getResource();
        if (current.getReferenceName().equalsIgnoreCase(resource.getReferenceName())) {
            count++;
        }
    }
    return count;
}