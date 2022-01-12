private org.tribot.api2007.types.RSObject closestTree(java.lang.String tree, int range) {
    org.tribot.api2007.types.RSObject[] objects = scripts.nodes.Objects.findNearest(range, tree);
    if ((objects.length) > 0)
        return objects[0];
    
    return null;
}