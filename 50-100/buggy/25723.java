public int getCluster(final com.orientechnologies.orient.core.metadata.schema.OClass iClass) {
    final int[] clusters = iClass.getClusterIds();
    if ((clusters.length) == 1)
        return clusters[0];
    
    if ((pointer) >= (clusters.length))
        pointer = 0;
    
    return clusters[((pointer)++)];
}