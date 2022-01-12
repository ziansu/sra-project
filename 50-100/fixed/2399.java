@java.lang.Override
public int compare(org.freeplane.features.map.NodeModel o1, org.freeplane.features.map.NodeModel o2) {
    if (o1 == o2)
        return 0;
    
    if (o1 == null)
        return -1;
    
    if (o2 == null)
        return 1;
    
    final org.freeplane.features.map.NodeAbsolutePath absoluteBeginPath = getPath(o1);
    final org.freeplane.features.map.NodeAbsolutePath absoluteEndPath = getPath(o2);
    return new org.freeplane.features.map.NodeRelativePath(absoluteBeginPath, absoluteEndPath).compareNodePositions();
}